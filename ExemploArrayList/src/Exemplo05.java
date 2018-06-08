import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Ricardo Borba
 */
public class Exemplo05 {

    public static void main(String[]args){
     
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int quantidade = 0;
            while(true){
                try{
                    numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "°número")));
                break;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Para Desgraça");
        }
    }
}    
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}

