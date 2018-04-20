import javax.swing.JOptionPane;

public class Exercicios4{
 
   public static void main(String[] args){

      int soma = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada você deseja?"));
      int n0 = 0*soma;	
      int n1 = 1*soma;
      int n2 = 2*soma;
      int n3 = 3*soma;
      int n4 = 4*soma;
      int n5 = 5*soma;
      int n6 = 6*soma;
      int n7 = 7*soma;
      int n8 = 8*soma;
      int n9 = 9*soma;
      int n10 = 10*soma;
      
      JOptionPane.showMessageDialog(null,"Tabuada: " + soma +
                         "\n0x0: " + n0 +
                         "\n0x1: " + n1 +
                         "\n0x2: " + n2 +
                         "\n0x3: " + n3 +
                         "\n0x4: " + n4 +
                         "\n0x5: " + n5 +
                         "\n0x6: " + n6 +
                         "\n0x7: " + n7 +
                         "\n0x8: " + n8 +
                         "\n0x9: " + n9 +
                         "\n0x10: " + n10);




  }
}