import javax.swing.JOptionPane;

  public class Estrutura11{

     public static void main(String[] args){
     
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira Nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda Nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira Nota"));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Quarta Nota"));
        double n5 = Double.parseDouble(JOptionPane.showInputDialog("Quinta Nota"));
        double media = (n1+n2+n3+n4+n5)/5;
        
        if(media>=7.99)
        JOptionPane.showMessageDialog(null,"Média: "+ media +
        "\nVocê foi Aprovado!"
        );
        else if(media<=7.99)
        JOptionPane.showMessageDialog(null,"Média: "+ media +
        "\nVocê foi Reprovado!"
        );


    }
  }