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
public class Retangulo extends Triangulo {
    
    public Retangulo (float base, float altura){
        super(base, altura);
    }
    
    public float area(){
        return super.area();
    }
    
        public float perimetro(){
            return (super.getAltura() * super.getBase())*2;
        }
    
            public void mostra(){
                System.out.println("\nÁrea: " + area() + "\nPerémetro: " + perimetro());
            }
        
    }
    

