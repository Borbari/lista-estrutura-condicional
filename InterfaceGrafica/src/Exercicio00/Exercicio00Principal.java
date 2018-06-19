
package Exercicio00;
import java.awt.EventQueue;
import Exercicio00.Exercicio00JButtonTela;

/**
 * @author Alunos
 */
public class Exercicio00Principal {
    public static void main(String[]args){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Exercicio00JButtonTela();
            }
        });
    }
    
}
