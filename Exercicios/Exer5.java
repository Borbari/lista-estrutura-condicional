import javax.swing.JOptionPane;
    public class Exer5{
        public static void main(String[] args){
            
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero"));
            int soma = n1+n2;
            int subtracao = n1-n2;
            int multiplicacao = n1*n2;
            int divisao = n1/n2;
                int operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: " + 
                "\n1Soma" +
                "\n2Subtrair: " + 
                "\n3Multiplicar: " +
                "\n4Dividir: "+
                "\n5Sair","Menu",JOptionPane.INFORMATION_MESSAGE));
            

            while(operacao < 5 && operacao > 0){
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
                operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: " + 
                "\n1Soma" +
                "\n2Subtrair: " + 
                "\n3Multiplicar: " +
                "\n4Dividir: " +
                "\n5Sair","Menu",JOptionPane.INFORMATION_MESSAGE));
                
            
            
            }
        }
    }