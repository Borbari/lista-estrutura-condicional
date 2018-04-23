import javax.swing.JOptionPane;
public class While01{
    public static void main(String[] args){
        int atual = 0;
       
        //loop infinito
        while(1==1){
            JOptionPane.showMessageDialog(null, "*");
            atual = atual + 1;
        }// loop até atual chegar no 10
        while (atual < 10){
             JOptionPane.showMessageDialog(null, "*");
            atual = atual + 1;
        }//loop ate atual for maior que 5
        while(atual < 5 ){
            System.out.println("*");
            atual = atual + 1;
        }


    }

}