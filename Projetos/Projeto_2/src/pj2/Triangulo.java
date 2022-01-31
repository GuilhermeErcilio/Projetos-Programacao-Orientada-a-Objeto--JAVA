/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author edile
 */
public class Triangulo {
    Float base;
    Float altura;

    public Triangulo() {
    }

    public Triangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
        
    }
    
    void ImprimeDados(){
        System.out.println("Dados da área: \nArea "+ base+ altura);
}
    Float CalculaArea(){
    Float Area;
    Area = (base*altura)/2;
    return Area;
    }
    
}
