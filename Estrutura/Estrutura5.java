import javax.swing.JOptionPane;

   public class Estrutura5{

      public static void main(String[] args){
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1° numero"));
         
         if (numero %2!= 0 ){ 
         System.out.println("impar");
         }
         else {
         System.out.println("Não é impar");
         }  
       

      }

}