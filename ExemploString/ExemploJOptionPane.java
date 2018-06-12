import javax.swing.JOptionPane;

public class ExemploJOptionPane{
  
   public static void main(String[] args){

   
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Litros?"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos consumidos?"));
      Double n3 = Double.parseDouble(JOptionPane.showInputDialog("Valor litros?"));

      double mediaLitros = n1*n2*365;
      JOptionPane.showMessageDialog(null,"M�dia Litros: " + mediaLitros); 
               
      
      
  }
}