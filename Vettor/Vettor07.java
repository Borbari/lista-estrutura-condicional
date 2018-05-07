import javax.swing.JOptionPane;
public class Vettor07{
    public static void main(String[]args){
        
        double menorAltura = Double.MAX_VALUE;
        double[] altura = new double[4];

        altura[0] = Double.parseDouble(JOptionPane.showInputDialog("Altura animal 1 "));
        altura[1] = Double.parseDouble(JOptionPane.showInputDialog("Altura animal 2 "));
        altura[2] = Double.parseDouble(JOptionPane.showInputDialog("Altura animal 3 "));
        altura[3] = Double.parseDouble(JOptionPane.showInputDialog("Altura animal 4 "));

        if(altura[0] < menorAltura){
            menorAltura = altura[0];
        }
        if(altura[1] < menorAltura){
            menorAltura = altura[1];
        }
        if(altura[2] < menorAltura){
            menorAltura = altura[2];
        }
        if(altura[3] < menorAltura){
            menorAltura = altura[3];
        }
        JOptionPane.showMessageDialog(null, "Menor Altura: " + menorAltura);
    }
}