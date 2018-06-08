package AtividadeArray;


import java.util.ArrayList;

/**
 * @author Ricardo Borba
 */
public class AtividadeArrayList2 {

    public static void main(String[]args){
    
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Paulo");
        nomes.add("Rodrigo");
        nomes.add("Renata");
        nomes.add("Julia");
        nomes.add("Ana");
        nomes.add("Mayara");
        nomes.add("Leticia");
        nomes.add("Djnnifer");
        nomes.add("Nao Sei");
        
        String nomesPosicao0 = nomes.get(0);
        String nomesPosicao1 = nomes.get(1);
        String nomesPosicao2 = nomes.get(2);
        String nomesPosicao3 = nomes.get(3);
        String nomesPosicao4 = nomes.get(4);
        String nomesPosicao5 = nomes.get(5);
        String nomesPosicao6 = nomes.get(6);
        String nomesPosicao7 = nomes.get(7);
        String nomesPosicao8 = nomes.get(8);
        
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
