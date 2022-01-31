/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author edile
 */
public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    void Cadastradados(){
    
    }
    void imprimeDados(){
       JOptionPane.showMessageDialog(null, "dia = " + dia+ "\nMes = "+mes+"\nAno = "+ano);
    }
    
}
