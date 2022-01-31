/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author edile
 */
public class FinalizaçãoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produto p1, p2;
       Scanner leia = new Scanner (System.in);
       
       //declaração
       String marca, fabricante, cod_barra;
       Float preço;
       
        System.out.println("Digite a marca ");
        marca = leia.nextLine();
        
        System.out.println("Digite o fabricante ");
        fabricante = leia.nextLine();
        
        System.out.println("Digite o codigo de barra ");
        cod_barra = leia.nextLine();
        
        System.out.println("Digite o preço ");
        preço = leia.nextFloat();
        
        //objeto 1 
        p1 = new Produto(marca, fabricante, cod_barra, preço);
        
        leia.nextLine();
        System.out.println("Digite a marca ");
        marca = leia.nextLine();
        
        System.out.println("Digite o fabricante ");
        fabricante = leia.nextLine();
        
        System.out.println("Digite o codigo de barra ");
        cod_barra = leia.nextLine();
        
        System.out.println("Digite o preço ");
        preço = leia.nextFloat();
        
        //objeto2
        p2 = new Produto(marca, fabricante, cod_barra, preço);
        
        System.out.println("Produto 1: \nMarca " + p1.marca + "\nFabricante " + p1.fabricante + 
                "\nCodigo de Barra " + p1.cod_barra +"\nPreço " + p1.preço);
        
        System.out.println("\nProduto 2: \nMarca " + p2.marca + "\nFabricante " + p2.fabricante + 
                "\nCodigo de Barra " + p2.cod_barra +"\nPreço\n " + p2.preço);
    }
    
}
