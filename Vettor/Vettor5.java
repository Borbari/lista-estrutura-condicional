import javax.swing.JOptionPane;
public class Vettor5{
    public static void main(String[]args){
    double somaTotal = 0;
    double media = 0;
    int [] pesos = new int [5];

    pesos[0] =  Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro peso"));  
    pesos[1] =  Integer.parseInt(JOptionPane.showInputDialog("digite o segundo peso")); 
    pesos[2] =  Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro peso")); 
    pesos[3] =  Integer.parseInt(JOptionPane.showInputDialog("digite o quarto peso")); 
    pesos[4] =  Integer.parseInt(JOptionPane.showInputDialog("digite o quinto peso"));

    somaTotal = pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4];
    media = pesos[0] + pesos[1] + pesos[2] + pesos[3] + pesos[4]/5;
    JOptionPane.showMessageDialog(null, "Soma Total: "+ somaTotal +
    "\nMédia: " + media );


    }
}