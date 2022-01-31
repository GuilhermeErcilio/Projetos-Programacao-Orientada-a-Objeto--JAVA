/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;

public class TesteFormatos {
  
    public static void main(String[] args) {
        
        float raio, altura, base;
        
        Circunferencia C;
        
        Retangulo R;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio: ");
            raio = leia.nextFloat();
            
            C = new Circunferencia (raio);
            
            C.mostra();
            
            System.out.println("\nDigite a altura de seu Retengulo: ");
                altura = leia.nextFloat();
            
                System.out.println("\n"
                        + "Digite a base de seu Retangulo: ");
                    base = leia.nextFloat();
                    
                    R = new Retangulo(base, altura);
                    R.mostra();
    }
    
}
