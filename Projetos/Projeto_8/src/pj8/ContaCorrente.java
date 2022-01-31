/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author edile
 */
public class ContaCorrente {
    String nome;
    Float saldo;
    Float limite;
    char tipo;

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, Float saldo, Float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }
    public ContaCorrente (String nome, Float saldo, char tipo){
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
        
    }  
    
   public void imprimeDados(){
        
        System.out.println("Dados da Conta: \nNome " + nome +
                "\nSaldo: " + saldo + "\nLimite: " + limite + 
                "\nTipo: " + tipo);
    }
     
    public void depositar (float valor){
            saldo = saldo + valor;
    }
    
    public void sacar(float valor){
    saldo = saldo - valor;
    }
    
    
   
}
