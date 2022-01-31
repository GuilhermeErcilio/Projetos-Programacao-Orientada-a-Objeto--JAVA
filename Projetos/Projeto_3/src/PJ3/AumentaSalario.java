/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author edile
 */
public class AumentaSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario(123,1568.99f, "professor");
        float porcentagem;
        
        System.out.println("Cracha: "+ f1.getCracha()+"\nSalario: " + f1.getSalario()+
                "\nCargo: "+f1.getCargo());
        
        f1.setCracha(456);
        f1.setSalario(2465f);
        f1.calculaAumento(10f);
        porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem de aumento "));
        /*este metodo utilizando o (JOptionPane) seria para o usuario digitar, ai inseri isso e la em cima vc chama 
        o tipo que nesse caso é float, e escreve o nome igual está lá em cima (float pocentagem;).
        
        */
        
        System.out.println("Cracha: "+ f1.getCracha()+"\nSalario: " + f1.getSalario()+
                "\nCargo: "+f1.getCargo()); 
    }
    
}
