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
public class Produto {
    String marca;
    String fabricante;
    String cod_barra;
    Float preço;

    public Produto() {
    }

    public Produto(String marca, String fabricante, String cod_barra, Float preço) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barra = cod_barra;
        this.preço = preço;
    }
    
    
}
