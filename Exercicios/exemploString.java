import javax.swing.JOptionPane;
public class exemploString{
    public static void main(String[] args){

        String nome = "Curso de Java";
        // retorna a quantidade de caracteres da String
        System.out.println(nome);
        System.out.println("Tamanho da String: " + nome.length());

        String nick = JOptionPane.showInputDialog(null, "Informe o nick do seu pager");
        if(nick.equals("")){
            JOptionPane.showMessageDialog(null,"Filho eu pedi para você o seu nick, ccccccta díficil?");
        }
        String jogoDoAno = " League of Legends ";
        // remove espaços do começo e do fim
        jogoDoAno = jogoDoAno.trim();
        String sistemaOperacional = "LiNUX";
            System.out.println(sistemaOperacional);
        // colocar o texto todo em caixa alta
        sistemaOperacional = sistemaOperacional.toUpperCase();
        System.out.println(sistemaOperacional);
        
        // colocar o texto todo em caixa baixa
        sistemaOperacional = sistemaOperacional.toLowerCase();
        System.out.println(sistemaOperacional);

        //pegar um caracter em determinado índice
        char letra = sistemaOperacional.charAt(2);
        //                      0123 45678910 1112
        String  nomeCompleto = "Juan Roberto da Rocha";
        System.out.println(nomeCompleto.substring(5,12));

        System.out.println(nomeCompleto.substring(5, 5 + 3));
        
        //Escolha por Letra
        String sigla = nomeCompleto.charAt(5) + " " +
        nomeCompleto.charAt(8);
        System.out.println(sigla);
        String nome2 = "casas ".trim();

        
        
        String nome = "casas ".trim().toLowerCase();
        //nome = nome.trim();

        char letra = nome.charAt(nome.length()-1);
        nome = (nome.trim());
        if(letra == "s"){
            //Plural
        }else{
            //Singular
        }


        
        
    
    }
}