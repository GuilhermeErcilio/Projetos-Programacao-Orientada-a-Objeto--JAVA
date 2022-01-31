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
public class Circunferencia extends Forma{

    private float raio;

    public Circunferencia (float raio){
        this.raio=raio;
    }
        
        public void setRaio(float raio){
            this.raio=raio;
        }

    public float getRaio() {
        return raio;
    }
        
        public float area(){
            return(float)(Math.PI*Math.pow(raio, 2));
        }

        public float perimetro(){
            return(float) (2 + Math.PI * raio);
        }
        
        public void mostra(){
            System.out.println("\nRaio: " + raio + "\nÁrea: " + area() + "\nPerimetro: " + perimetro());
        }
        
}
