/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author edile
 */
public class Vendedor {
    private String nome;
    private int faltas;
    private float vendas;
    private float salario;

    public Vendedor(String nome, int faltas, float vendas, float salario) {
        this.nome = nome;
        this.faltas = faltas;
        this.vendas = vendas;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public float getSalario() {
        return salario;
    }

    public float getVendas() {
        return vendas;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    public void ImprimeDados(){
        System.out.println("Informações do Funcionário: \nVendas: " + vendas+
                "\nSalario: " + salario + "\nNome: "+ nome + "\nFaltas: "+faltas+
                "\nDesconto Salarial será de: " + descontoFalta()+
                "\nvalor do saário Bruto é de: "+calculaSalario());
    }
    public float calculaSalario(){
    float bruto = this.salario + this.calculaComissao() - this.descontoFalta();
    return bruto;
    }
    
    public float descontoFalta(){
    float desconto = (this.salario/30*faltas)*this.faltas;
    return desconto;
    }
    
    public float calculaComissao(){
    float venda = this.vendas;
    if(this.vendas >=1000 || this.vendas <2000){
        venda = this.vendas*0.10f;
    }else{
    venda = this.vendas*0.15f;
    }
        System.out.println("\nSua comissão foi: " + venda + "R$");
        return venda ;
    }
}