/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author edile
 */
public class Funcionario {
    
    private int cracha;
    private float salario;
    private String cargo;

    public Funcionario() {
        cargo = "Assistente";
    }

    public Funcionario(int cracha, float salario, String cargo) {
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }
    //metodos de acesso
    //leitura
    public int getCracha(){
        return this.cracha;
    }
    public float getSalario(){
        return this.salario;
}
    public String getCargo(){
        return this.cargo;
    }
    
    //escrita
    public void setCracha(int cracha){
        this.cracha = cracha;
    }
    public void setSalario(float salario){
        if(salario>0){
        this.salario = salario;
        }else{
            System.out.println("salario inválido");
        }
    }
    public void setCargo(String cargo){
        if(cargo.length()!=0){
        this.cargo = cargo;
        }
    }
 
    
    public void calculaAumento(float porcentagem){
        salario = salario+salario*porcentagem/100;
    }
    
    public void calculaTempo(int tempo){
    salario = salario + tempo*150;
    
    }
}
