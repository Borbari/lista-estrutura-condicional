import javax.swing.JOptionPane;

public class Exercicios2{
  
   public static void main(String[] args){

   
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Litros?"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos consumidos?"));
      double n3 = Double.parseDouble(JOptionPane.showInputDialog("Valor litros?"));

      




      double mediaLitros = n1*n2*365;
      JOptionPane.showMessageDialog(null,"Média Litros: " + mediaLitros +
                       "\nQuantidade de Litros: " + n1 +
                       "\nQuantidade de anos consumidos: " + n2 +
                       "\nValor litros: " + n3); 
      
                 


  }
}