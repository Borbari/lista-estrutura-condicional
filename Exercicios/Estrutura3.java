import javax.swing.JOptionPane;

   public class Estrutura3{

      public static void main(String[] args){

      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero?"));
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero?"));
      int soma = n1+n2;
      int subtracao = n1-n2;
      int multiplicacao = n1*n2;
      int divisao = n1/n2;
      
      int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu"+
      "\n1-soma " +
      "\n2-subtração "+
      "\n3-multiplicação "+
      "\n4-divisão ","titulo",JOptionPane.INFORMATION_MESSAGE));
    
      if(operacao == 1){
        JOptionPane.showMessageDialog(null, soma); 
      }
      else if(operacao == 2){
        JOptionPane.showMessageDialog(null, subtracao);  
      }
      else if(operacao ==3){
        JOptionPane.showMessageDialog(null, multiplicacao);
        }
      else if(operacao ==4){
          JOptionPane.showMessageDialog(null, divisao);
      }
      
      }
}