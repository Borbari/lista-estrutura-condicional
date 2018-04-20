import javax.swing.JOptionPane;

public class ExemploDados{

   public static void main(String[] args) {
   
      //permitir o usuário digitar seu nome
      JOptionPane.showMessageDialog(null, "Preencha seu Cadastro");
      String nome = JOptionPane.showInputDialog("Nome");
      String sobrenome = JOptionPane.showInputDialog("sobrenome");
      String corPreferida = JOptionPane.showInputDialog("corPreferida");
      String bairro = JOptionPane.showInputDialog("bairro");
      String numero = JOptionPane.showInputDialog("numero");
      String cidade = JOptionPane.showInputDialog("cidade");
      String telefone = JOptionPane.showInputDialog("telefone");
      String estado = JOptionPane.showInputDialog("estado");
      String cpf = JOptionPane.showInputDialog("cpf");
      String nomeCompleto = nome + " " + sobrenome;

      int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Idade"));
      double peso = Integer.parseInt(
                JOptionPane.showInputDialog("peso"));
      double altura = Integer.parseInt(
                JOptionPane.showInputDialog("altura"));
 


      JOptionPane.showMessageDialog(null,
         "Nome Completo: " + nomeCompleto + 
         "\nIdade: " + idade +
         "\nCor Preferida: " + corPreferida +
         "\nPeso: " + peso +
         "\nAltura: " + altura +
         "\nBairro: " + bairro +
         "\nNúmero: " + numero +
         "\nCidade: " + cidade +
         "\nTelefone: " + telefone +
         "\nEstado: " + estado +
         "\nCpf: " + cpf );	





  }
}