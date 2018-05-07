import javax.swing.JOptionPane;
public class Vettor6{
    public static void main(String[]args){

        int maiorIdade = Integer.MIN_VALUE;
        int[] idade = new int[9];

        idade [0] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 1 "));
        idade [1] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 2 "));
        idade [2] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 3 "));
        idade [3] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 4 "));
        idade [4] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 5 "));
        idade [5] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 6 "));
        idade [6] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 7 "));
        idade [7] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 8 "));
        idade [8] = Integer.parseInt(JOptionPane.showInputDialog("Solicite a idade 9 "));
        
        if(idade [0] < maiorIdade){
            maiorIdade = idade [0];
        }
        if(idade [1] > maiorIdade){
            maiorIdade = idade [1];
        }
        if(idade [2] > maiorIdade){
            maiorIdade = idade [2];
        }
        if(idade [3] > maiorIdade){
            maiorIdade = idade [3];
        }
        if(idade [4] > maiorIdade){
            maiorIdade = idade [4];
        }
        if(idade [5] > maiorIdade){
            maiorIdade = idade [5];
        }
        if(idade [6] > maiorIdade){
            maiorIdade = idade [6];
        }
        if(idade [7] > maiorIdade){
            maiorIdade = idade [7];
        }
        if(idade [8] > maiorIdade){
            maiorIdade = idade [8];
        }

        JOptionPane.showMessageDialog(null, "Maior Idade: " + maiorIdade);



    }
}