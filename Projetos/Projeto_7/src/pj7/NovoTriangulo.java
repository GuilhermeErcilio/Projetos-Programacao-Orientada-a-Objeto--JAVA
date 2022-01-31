/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author edile
 */
public class NovoTriangulo {
    
    //atributos com modificadores de acesso
    private double base;
    private double altura;
    
    //construtores

    public NovoTriangulo() {
    }

    public NovoTriangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //métodos de acesso
    //leitura = obtem o valor do atributo
   public double getBase(){
        return base;
    }
   
   //gravação/escrita = alteram o valor do atributo
   public void setBase(double base){
        this.base = base;
    } 
   
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    } 
    
    double calculaArea(){
        double area;
        area = (base * altura)/2;
        return area;
    }
 
    public void imprimeDados(){
        System.out.println("Dados: \nBase: " + base + 
                "\nAltura: " + altura + "\nArea: " + calculaArea());
    }
    
}
