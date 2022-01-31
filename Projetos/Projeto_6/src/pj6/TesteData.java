/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author edile
 */
public class TesteData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data(05,05,2000);
        
        d1.imprimeDados();
        d2.imprimeDados();
    }
    
}
