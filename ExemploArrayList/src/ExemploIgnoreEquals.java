import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ExemploIgnoreEquals {

    
    public static void main(String[]args){
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ricardo");
        nomes.add("Rafael");
        nomes.add("Natalia");
        nomes.add("Gabriel");
        nomes.add("Luana");
        nomes.add("Rosane");
        nomes.add("Oliveira");
        nomes.add("Borba");
        nomes.add("Ana Maria");
        nomes.add("Ana Da silva");
        
        String maiorNome = "";
        
        if(nomes.get(0).length() > maiorNome.length()){
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
        if(nomes.get(4).length() > maiorNome.length()){
            maiorNome = nomes.get(4);
        }
        if(nomes.get(5).length() > maiorNome.length()){
            maiorNome = nomes.get(5);
        }
        if(nomes.get(6).length() > maiorNome.length()){
            maiorNome = nomes.get(6);
        }
        if(nomes.get(7).length() > maiorNome.length()){
            maiorNome = nomes.get(7);
        }
        if(nomes.get(8).length() > maiorNome.length()){
            maiorNome = nomes.get(8);
        }
        if(nomes.get(9).length() > maiorNome.length()){
            maiorNome = nomes.get(9);
        }
        String menorNome = "aaaaaaaaaaa";
        
        if(nomes.get(0).length() < menorNome.length()){
            menorNome = nomes.get(0);
        }
        if(nomes.get(1).length() < menorNome.length()){
            menorNome = nomes.get(1);
        }
        if(nomes.get(2).length() < menorNome.length()){
            menorNome = nomes.get(2);
        }
        if(nomes.get(3).length() < menorNome.length()){
            menorNome = nomes.get(3);
        }
        if(nomes.get(4).length() < menorNome.length()){
            menorNome = nomes.get(4);
        }
        if(nomes.get(5).length() < menorNome.length()){
            menorNome = nomes.get(5);
        }
        if(nomes.get(6).length() < menorNome.length()){
            menorNome = nomes.get(6);
        }
        if(nomes.get(7).length() < menorNome.length()){
            menorNome = nomes.get(7);
        }
        if(nomes.get(8).length() < menorNome.length()){
            menorNome = nomes.get(8);
        }
        if(nomes.get(9).length() < menorNome.length()){
            menorNome = nomes.get(9);
        }
        
        int paulo = 0;
        int ana = 0;
        int vogal = 0;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase("Paulo")) {
                paulo++;
            } else if (nomes.get(i).equalsIgnoreCase("Ana")) {
                ana++;
                vogal++;
                continue;
            }
            String comparacao = "" + nomes.get(i).charAt(0);
            if (comparacao.equalsIgnoreCase("a")
                    || comparacao.equalsIgnoreCase("e")
                    || comparacao.equalsIgnoreCase("i")
                    || comparacao.equalsIgnoreCase("o")
                    || comparacao.equalsIgnoreCase("u")) 
                vogal++;
           
        }

        JOptionPane.showMessageDialog(null,
                "[0] => " + nomes.get(0) +
                "\n[1] =>" + nomes.get(1)
                + "\n[2] =>" + nomes.get(2)
                + "\n[3] =>" + nomes.get(3)
                + "\n[4] =>" + nomes.get(4)
                + "\n[5] =>" + nomes.get(5)
                + "\n[6] =>" + nomes.get(6)
                + "\n[7] =>" + nomes.get(7)
                + "\n[8] =>" + nomes.get(8)
                + "\n[9] =>" + nomes.get(9)
                +"\n"
                + "\nNome com o maior nome: " + maiorNome 
                + "\nNome com o menor nome: " + menorNome
                + "\nQuantidade de nomes com o nome Paulo: " + paulo
                + "\nQuantidade de nomes com o nome Ana: " + ana
                + "\nQuantidade de nomes com a primeira letra sendo uma vogal: " + vogal
        );
    }

} 