/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

/**
 *
 * @author edile
 */
public class Torneio {
    private String nome;
    private int idade;

    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    String verificaConceito(){
        String categoria = "";
        if(idade >= 5 && idade <= 7){
            categoria = " Infantil";
        }else if (idade >= 8 && idade <=10){
            categoria = " Juvenil";
        }
        else if (idade >= 11 && idade <=15){
             categoria = " Adolescente";
        }
        else if (idade >= 16 && idade <=30){
             categoria = " Adulto";
        }
        else if(idade >30){
            categoria = " Sênior";
        }
        return categoria;              
    }
    
    void imprimeDados(){
    System.out.println("Dados do Torneio \nParticipante: " + nome +
                "\nCategoria: " + idade + verificaConceito());
    }
    
}
