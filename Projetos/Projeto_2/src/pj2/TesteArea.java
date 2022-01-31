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
public class TesteArea {

    
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo(10f, 20f);
        
        t1.ImprimeDados();
        t2.ImprimeDados();
        
        Float Area = t2.CalculaArea();
        System.out.println("\nÁrea do triângulo: " + Area);
    }
    
    
}
