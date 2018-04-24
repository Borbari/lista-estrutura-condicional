import javax.swing.JOptionPane;
public class Exer1{
    public static void main(String[] args){
        int atual = 0;
        String nome = JOptionPane.showInputDialog(null, "Digite o nome");


        while(!nome.equals("sair")){
             nome = JOptionPane.showInputDialog("Digite os nomes");
                        
        }     
    }
}