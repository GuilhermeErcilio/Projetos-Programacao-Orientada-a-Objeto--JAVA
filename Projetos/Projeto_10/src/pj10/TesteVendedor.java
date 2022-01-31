/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

/**
 *
 * @author edile
 */
public class TesteVendedor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendedor x = new Vendedor("Guilherme", 2, 1800, 1900);
        Vendedor y = new Vendedor("Ercilio", 3, 850, 1400);
        
        x.ImprimeDados();
        x.descontoFalta();
        
        y.ImprimeDados();
        y.descontoFalta();
    }
    
}
