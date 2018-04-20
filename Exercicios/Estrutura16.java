import javax.swing.JOptionPane;
public class Estrutura16{
    public static void main(String[] args){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("temperatura a ser invertida"));
        String origem = JOptionPane.showInputDialog(null, 
        "Selicione uma origem",
        "Nao sei",
        JOptionPane.INFORMATION_MESSAGE,
        null,
        new Object[]{
            "Selicione uma origem", "Celsius", "Fahrenheit", "Kelvin",
        },
        ""
        ).toString();
        System.out.println(origem);
        if(origem.equals("Celsius"));    


    }
}