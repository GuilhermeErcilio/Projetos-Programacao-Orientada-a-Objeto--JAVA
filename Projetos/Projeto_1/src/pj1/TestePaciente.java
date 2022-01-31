
import javax.swing.JOptionPane;


public class TestePaciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente("Guilherme");
        
        p1.nome = JOptionPane.showInputDialog("Digite seu nome");
        p1.rg = JOptionPane.showInputDialog("Digite seu RG");
        p1.endereço = JOptionPane.showInputDialog("Digite seu endereço");
        p1.telefone = JOptionPane.showInputDialog("Digite seu telefone");
        p1.dataNascimento = JOptionPane.showInputDialog("Digite sua data de Nascimento");
        p1.profissao = JOptionPane.showInputDialog("Digite sua profissao");
        
        p2.rg = JOptionPane.showInputDialog("Digite seu RG");
        p2.endereço = JOptionPane.showInputDialog("Digite seu endereço");
        p2.telefone = JOptionPane.showInputDialog("Digite seu telefone");
        p2.dataNascimento = JOptionPane.showInputDialog("Digite sua data de Nascimento");
        p2.profissao = JOptionPane.showInputDialog("Digite sua profissao");
        
        System.out.println("Dados Paciente 1 \nNome: "+p1.nome + "\nRG: "+ p1.rg + "\nEndereço: " + p1.endereço + "\nTelefone: " + p1.telefone + 
                "\nData de Nascimento: " + p1.dataNascimento + "\nProfissão: " + p1.profissao); 
        
        System.out.println("\nDados Paciente 2 \nNome: "+p2.nome + "\nRG: "+ p2.rg + "\nEndereço: " + p2.endereço + "\nTelefone: " + p2.telefone + 
                "\nData de Nascimento: " + p2.dataNascimento + "\nProfissão: " + p2.profissao);  
    }
    
}
