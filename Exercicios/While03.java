import javax.swing.JOptionPane;
public class While03{
    public static void main(String[] args){
        //solitando 3 nomes
        int quantidadeMaxima = 3;
                        //variavel maiorIdade           //variavel menor idade
        int atual = 0, maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE;

        while(atual < quantidadeMaxima){
            String nome = JOptionPane.showInputDialog(null, 
                "Digite o seu nome");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            //apresentar maior idade
            if(idade > maiorIdade){
                maiorIdade = idade;
            }//apresentar menor idade
            if(idade < menorIdade){
                menorIdade = idade;
            }
         
            atual = atual + 1;
        }//mostrar na tela maior e menor idade
        JOptionPane.showMessageDialog(null, "A maior idade é: " + maiorIdade+
            "\nMenor Idade é: " + menorIdade);


    }
}