import java.util.ArrayList;
/**
 *
 * @author Alunos
 */
public class Exemplo2 {
    public static void main(String[]args){
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jennifer");
        nomes.add("Eu Aqui");
        nomes.add("Poney");
        nomes.add("Homem da Cadeira Ambulante");
        
        int quantidadeDeItensNoArrayList = nomes.size();
        System.out.println(quantidadeDeItensNoArrayList);
        
        String maiorNome = "";
        
        if(nomes.get(0).length()> maiorNome.length()){
            maiorNome = nomes.get(0);
        }
        if(nomes.get(1).length() > maiorNome.length()){
            maiorNome = nomes.get(1);
        }
        if(nomes.get(2).length() > maiorNome.length()){
            maiorNome = nomes.get(2);
        }
        if(nomes.get(3).length() > maiorNome.length()){
            maiorNome = nomes.get(3);
        }
        
        String menorNome = "aaaaaaaaaaaaaaaaaaaaaa";
        for(int i = 65; i <= 90; i++){
            for(int j = 65; j <= 90; j++){
                menorNome += (char) i + "" + (char) j + "\n";
            }
        }
        if (nomes.get(0).length()< maiorNome.length()){
            menorNome = nomes.get(0);
        }
        if (nomes.get(1).length()< maiorNome.length()){
            menorNome = nomes.get(1);
        }
        if (nomes.get(2).length()< maiorNome.length()){
            menorNome = nomes.get(2);
        }
        if (nomes.get(3).length()< maiorNome.length()){
            menorNome = nomes.get(3);
        }
        System.out.println("Maior Nome: " + maiorNome);
        System.out.println("Menor Nome: " + menorNome);
        
    }
}
