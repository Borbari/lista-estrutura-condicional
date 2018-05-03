import javax.swing.JOptionPane;

   public class Estrutura12{
 
      public static void main(String[] args){

       int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero"));
       int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
       if (n1>n2){
        JOptionPane.showMessageDialog(null, "Número 1 é maior: "+ n1);
       }else if (n1<n2){
        JOptionPane.showMessageDialog(null,"Número 2 é maior: "+ n2);
       }
    }
   }