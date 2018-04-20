import javax.swing.JOptionPane;

   public class Estrutura2{

      public static void main(String[] args){
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1° numero"));
         
         if (numero < 0 ){
         System.out.println("negativo");
         }
         else {
         System.out.println("Não é negativo");
         }  
       

      }

}