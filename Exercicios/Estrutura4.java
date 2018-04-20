import javax.swing.JOptionPane;

   public class Estrutura4{

      public static void main(String[] args){
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1° numero"));
         
         if (numero %2== 0 ){ 
         System.out.println("par");
         }
         else {
         System.out.println("Não é par");
         }  
       

      }

}