package AtividadeArray;
import java.util.ArrayList;

/**
 * @author Ricardo Borba
 */
public class AtividadeArrayList4 {

    public static void main(String[]args){
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        
    for(int i=0; i < numeros.size(); i++){
        System.out.println("Números: " + numeros.get(i));
    }
    System.out.print("\n");
    
    numeros.remove(3);
    for(int i = 0; i < numeros.size(); i++){
        System.out.println("Números: " + numeros.get(i));
    }
    System.out.print("\n");
    
    numeros.remove(4);
    for(int i = 0; i < numeros.size(); i++){
        System.out.println("Números: " + numeros.get(i));
    }
    
    }
}        