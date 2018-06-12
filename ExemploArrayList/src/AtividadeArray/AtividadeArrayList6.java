import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class AtividadeArrayList6 {
    
    public static void mais(String[]args){
    
        ArrayList<Integer> numeros = new ArrayList<>();
    for(int i =0; i < 5; i++){
    numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite N°" + (i+1) + "numero")));
        }
    System.out.println(numeros);
    }
}