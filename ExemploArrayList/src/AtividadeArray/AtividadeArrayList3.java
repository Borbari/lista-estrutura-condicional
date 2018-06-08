package AtividadeArray;

import java.util.ArrayList;
/**
 * @author Ricardo Borba
 */
public class AtividadeArrayList3 {

    public static void main(String[]args){
        
        ArrayList<Character> nomes = new ArrayList<>();
        nomes.add('P');
        nomes.add('r');
        nomes.add('e');
        nomes.add('g');
        nomes.add('u');
        nomes.add('i');
        nomes.add('ç');
        nomes.add('a');
        nomes.add('!');
        
        char nomesPosicao0 = nomes.get(0);
        char nomesPosicao1 = nomes.get(1);
        char nomesPosicao2 = nomes.get(2);
        char nomesPosicao3 = nomes.get(3);
        char nomesPosicao4 = nomes.get(4);
        char nomesPosicao5 = nomes.get(5);
        char nomesPosicao6 = nomes.get(6);
        char nomesPosicao7 = nomes.get(7);
        char nomesPosicao8 = nomes.get(8);
        
        System.out.println("[0] => " + nomesPosicao0);
        System.out.println("[1] => " + nomesPosicao1);
        System.out.println("[2] => " + nomesPosicao2);
        System.out.println("[3] => " + nomesPosicao3);
        System.out.println("[4] => " + nomesPosicao4);
        System.out.println("[5] => " + nomesPosicao5);
        System.out.println("[6] => " + nomesPosicao6);
        System.out.println("[7] => " + nomesPosicao7);
        System.out.println("[8] => " + nomesPosicao8);
        
        int quantidadeDeItensNoArrayList = nomes.size();
        System.out.println(quantidadeDeItensNoArrayList);
}
}
