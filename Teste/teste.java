import javax.swing.JOptionPane;
public class teste{
    public static void main(String[] args){

        String nome = "";
        int quantidadeMaxima = 2;
        char menorNome = nome.charAt(0);
        char maiorNome = nome.charAt(0);              
        int atual = 0;
        

        while(atual < quantidadeMaxima){
            nome = JOptionPane.showInputDialog(null,"Digite o seu nome");
                                                                       
            //apresentar maior idade
            if(maiorNome > menorNome){
                maiorNome = menorNome;
            }//apresentar menor idade
            if(maiorNome< menorNome){
                menorNome = maiorNome;
            }
         
            atual = atual + 1;
        }//mostrar na tela maior e menor idade
        JOptionPane.showMessageDialog(null, "A maior idade é: " + maiorNome+
            "\nMenor Idade é: " + menorNome);


    
  }
}