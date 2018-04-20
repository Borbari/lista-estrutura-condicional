import javax.swing.JOptionPane;
 
   public class Exercicios8{

      public static void main(String[] args){

      double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta de luz"));
      double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta da água"));
      double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta da net"));
      double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta da vivo"));
      double n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta de NET"));
      double n6 = Double.parseDouble(JOptionPane.showInputDialog("Digite a conta do carro"));

      double telefone = n3+n4+n5;
      double impostos = n5+n6;
      double restante = n1+n2;
      double total = n1+n2+n3+n4+n5+n6;

      JOptionPane.showMessageDialog(null, "Valor das contas do telefone: " + telefone +
                  "\nValor dos impostos: " + impostos +
                  "\nValor do restante das contas: " + restante +
                  "\nValor total das contas: " + total);




      }
   }
