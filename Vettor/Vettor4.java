import javax.swing.JOptionPane;
public class Vettor4{
    public static void main(String[]args){
        double somaTotal = 0;
        String disciplina = "";
        double[] notas = new double [4];
    
        disciplina = JOptionPane.showInputDialog("digite a disciplina");
        notas [0] = Double.parseDouble(JOptionPane.showInputDialog("digite a primeira nota"));
        notas [1] = Double.parseDouble(JOptionPane.showInputDialog("digite a segunda nota"));
        notas [2]  = Double.parseDouble(JOptionPane.showInputDialog("digite a terceira nota"));
        notas [3]  = Double.parseDouble(JOptionPane.showInputDialog("digite a quarta nota"));
        
        somaTotal = (notas [0] + notas [1] + notas [2] + notas[3])/4;
        
        
        JOptionPane.showMessageDialog(null, "Disciplina: " + disciplina +
        "\nMédia: " + somaTotal);
    }
}