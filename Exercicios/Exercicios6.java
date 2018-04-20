import javax.swing.JOptionPane;

   public class Exercicios6{

      public static void main(String[] args) {
     
     double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 1° nota"));
     double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 2° nota"));
     double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 3° nota"));
     double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 4° nota"));
     double media = (nota1+nota2+nota3+nota4)/4;

     JOptionPane.showMessageDialog(null, "Média= " + media);




   }}
   