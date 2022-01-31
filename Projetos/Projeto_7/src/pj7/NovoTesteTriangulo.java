/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import javax.swing.JOptionPane;


public class NovoTesteTriangulo {

    public static void main(String[] args) {
        NovoTriangulo t = new NovoTriangulo();
        NovoTriangulo t2 = new NovoTriangulo();
       
        double base, altura;
      
        //atribuindo valores aos atributos
        t.setBase(4);
        t.setAltura(2);
        
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base:"));
        t2.setBase(base);
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura:"));
        t2.setAltura(altura);
       
        
        //utilização do método
        t.imprimeDados();
        System.out.println("\n");
        t2.imprimeDados();
    }
    
}
