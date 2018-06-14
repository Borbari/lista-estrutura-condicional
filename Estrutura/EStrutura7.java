import javax.swing.JOptionPane;

   public class Estrutura7{

      public static void main(String[] args){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 numero"));

            if(numero %2 == 0 ){ 
                  JOptionPane.showMessageDialog(null, "é par");
            }
            else if(numero %2 != 0){ 
                  JOptionPane.showMessageDialog(null, "é impar");
            }                                                                          
            else if(numero == 0){       
                  JOptionPane.showMessageDialog(null, "é neutro");
            }  

            if (numero > 0 ){
                  JOptionPane.showMessageDialog(null, "é positivo");
            }
            else if (numero < 0 ){
                  JOptionPane.showMessageDialog(null, "é negativo");
            }
            
            
            if (numero > 10 ){
                  JOptionPane.showMessageDialog(null, "é maior que 10");
            }
            if (numero <= 50 ){
                  JOptionPane.showMessageDialog(null, "é menor que 50");
            }
            if (numero <= -10 ){
                  JOptionPane.showMessageDialog(null, "é menor que -10");
            }
            if (numero >= 30 ){
                  JOptionPane.showMessageDialog(null, "é maior que 30");
            }
            if (numero == 1 ){
                  JOptionPane.showMessageDialog(null, "é número diferente de 1");
            }       
      }

}