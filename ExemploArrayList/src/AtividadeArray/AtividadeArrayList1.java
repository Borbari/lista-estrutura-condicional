package AtividadeArray;

import java.util.ArrayList;
/**
 *
 * @author Alunos
 */
public class AtividadeArrayList1 {
    public static void main(String[] args) {
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
        
        int numeroPosicao0 = numeros.get(0);
        int numeroPosicao1 = numeros.get(1);
        int numeroPosicao2 = numeros.get(2);
        int numeroPosicao3 = numeros.get(3);
        int numeroPosicao4 = numeros.get(4);
        int numeroPosicao5 = numeros.get(5);
        int numeroPosicao6 = numeros.get(6);
        int numeroPosicao7 = numeros.get(7);
        int numeroPosicao8 = numeros.get(8);
        int numeroPosicao9 = numeros.get(9);
        
        
        System.out.println("[0] => " + numeroPosicao0);
        System.out.println("[1] => " + numeroPosicao1);
        System.out.println("[2] => " + numeroPosicao2);
        System.out.println("[3] => " + numeroPosicao3);
        System.out.println("[4] => " + numeroPosicao4);
        System.out.println("[5] => " + numeroPosicao5);
        System.out.println("[6] => " + numeroPosicao6);
        System.out.println("[7] => " + numeroPosicao7);
        System.out.println("[8] => " + numeroPosicao8);
        System.out.println("[9] => " + numeroPosicao9);
        
        
        int soma = numeroPosicao0 
                + numeroPosicao1 
                + numeroPosicao2 
                + numeroPosicao3 
                + numeroPosicao4
                + numeroPosicao5
                + numeroPosicao6
                + numeroPosicao7
                + numeroPosicao8
                + numeroPosicao9;
            System.out.print("Soma" + soma);
    }
}
   
