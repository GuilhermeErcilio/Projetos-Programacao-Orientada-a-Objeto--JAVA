
/*Considere os diagramas UML dos seguintes itens, observe que cada item possue 2
construtores distintos. Construa o código das respectivas classes e crie 2 objetos usando
os construtores criados e os preencha com dados fornecidos pelo usuário. Exiba os
dados dos objetos./*


/**
 *
 * @author edile
 */
public class Paciente {
    
    String nome;
    String rg;
    String endereço;
    String telefone;
    String dataNascimento;
    String profissao;
    
    //metodos
    Paciente(){}

    public Paciente(String nome) {
        this.nome = nome;
        
    }
   }

