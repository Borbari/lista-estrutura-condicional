package AtividadeArray;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Ricardo Borba
 */
public class AtividadeArrayList5 {

    public static void main(String[]args){
        
        ArrayList<String> nomes = new ArrayList<>();
        for(int i=0; i < 5; i++){
        nomes.add(JOptionPane.showInputDialog(null, "Digite N"+(i+1)+ "° nomes",JOptionPane.QUESTION_MESSAGE));
       
        }
        String buscar = JOptionPane.showInputDialog("Buscar nome gravado");
        for (int i = 0; i < nomes.size(); i++) {
            if (buscar.equals(nomes.get(i))) {
                JOptionPane.showMessageDialog(null, "Nome " + buscar + " não existente!","Resposta",JOptionPane.INFORMATION_MESSAGE);
            break;
            }
            if(i == nomes.size()-1){
                JOptionPane.showMessageDialog(null, "Nome " + buscar + " não existe!","Resposta",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
