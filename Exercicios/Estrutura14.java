import javax.swing.JOptionPane;

    public class Estrutura14{
    
        public static void main(String[] args){

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("primeiro numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("segundo numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("terceiro numero"));
        
           //Crescente
            if ((n1>=n2) && (n2>=n3)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n3 +" "+ n2 +" "+ n1);

            }else if((n2>=n1) && (n2>=n3) && (n1>=n3)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n3 +" "+ n2 +" "+ n1);
            
            }else if((n2>=n1) && (n2>=n3) && (n1<=n3)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n1 +" "+ n3 +" "+ n2);

            }else if((n2>=n1) && (n2<=n3)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n1 +" "+ n2 +" "+ n3);

            }else if((n2<=n1) && (n1<=n3)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n2 +" "+ n1 +" "+ n3);
        
            }else if((n2<=n3) && (n3<=n1)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n2 +" "+ n3 +" "+ n1);
            
            }else if((n1>=n3) &&(n2>=n3)){
                JOptionPane.showMessageDialog(null, "Ordem: "+ n1 +" "+ n2 +" "+ n3);
            
            }
        }
        }


    