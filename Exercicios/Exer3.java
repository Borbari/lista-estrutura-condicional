import javax.swing.JOptionPane;
public class Exer3{
    public static void main(String[] args){
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o seu peso"));
        int quantPessoas = 0;
        
        while(peso > 0 && peso <= 300 ){
            JOptionPane.showMessageDialog(null, "Peso: " + peso + "Kg");
            quantPessoas = quantPessoas + 1;
            peso = Integer.parseInt(JOptionPane.showInputDialog(null, "digite o seu peso"));
        }
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas: " + quantPessoas);  
        
       
        
                       
    }
}