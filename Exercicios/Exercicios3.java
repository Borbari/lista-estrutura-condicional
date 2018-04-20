import javax.swing.JOptionPane;

public class Exercicios3{
  
   public static void main(String[] args){

   
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero?"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("segundo numero?"));
      
      int soma = n1+n2;
      int subtracao = n1-n2;
      int multiplicacao = n1*n2;
      int divisao = n1/n2;

      JOptionPane.showMessageDialog(null,"Soma: " + soma +
                       "\nSubtração: " + subtracao +
                       "\nMultiplicação: " + multiplicacao +
                       "\nDivisão: " + divisao); 
      



  }
}