
import java.util.Scanner;
import javax.swing.JOptionPane;




/**
 *
 * @author Alunos
 */
public class AtividadeArrayList8 {
    
    public static void main(String[]args){
        
        Integer vetor[] = new Integer[10];
        Integer vetorPar[] = new Integer[10];
        Integer vetorImpar[] = new Integer[10];
        double media = 0;
        double soma = 0;
        double somaPares = 0;
        double mediaImpar = 0;
        double quantidade = 0;
        Scanner entrada = new Scanner(System.in);
        
           
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite: ");
            vetor[i] = entrada.nextInt();
        }

        int posicaoPar = 0;
        int posicaoImpar = 0;
        for (int n = 0; n < vetor.length; n++) {
            if (vetor[n] % 2 == 0) {
                vetorPar[posicaoPar] = vetor[n];
                posicaoPar++;
            } else {
                vetorImpar[posicaoImpar] = vetor[n];
                posicaoImpar++;
            }

        }
        for (int i = 0; i < vetorPar.length; i++) {
            if (vetorPar[i] == null) {
                break;
            }
            System.out.print(vetorPar[i]);
        }
        for (int i = 0; i < vetorImpar.length; i++) {
            if (vetorImpar[i] == null) {
                break;
            }
            System.out.print(vetorImpar[i]);
        }
        String texto;
        
        JOptionPane.showMessageDialog(null, 
            "Salários:\n"
            
            + "\nMédia: " + media
            + "\nSoma: " + soma
            + "\nSoma Pares: " + somaPares
            + "\nMédia Ímpares: " + mediaImpar
            + "\nQuantidade Armazenada: " + quantidade);
    
    }
}
                
                