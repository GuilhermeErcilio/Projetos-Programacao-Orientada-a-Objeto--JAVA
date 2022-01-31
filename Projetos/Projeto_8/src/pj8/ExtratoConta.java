/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author edile
 */
public class ExtratoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente();
        char c = 0;
        
        ContaCorrente p2 = new ContaCorrente("guilherme", 1000f, 1250f, c);
            Scanner leia = new Scanner(System.in);
        float rendimento, valor;
        
        //executando os métodos
        p1.imprimeDados();
        p2.imprimeDados();
    }
    
}
