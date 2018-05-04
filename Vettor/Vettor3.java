import javax.swing.JOptionPane;
public class Vettor3{
    public static void main(String[] args){

        String[] nomes = new String[7];
        double[] precos = new double[7];

        nomes[0] = "Maça";
        precos[0] = 10.40;

        nomes[1] = "uva";
        precos[1] = 12.00;

        nomes[2] = "Melancia";
        precos[2] = 9.56;

        nomes[3] = "Pera";
        precos[3] = 4.50;

        nomes[4] = "Morango";
        precos[4] = 11.30;

        nomes[5] = "Laranja";
        precos[5] = 13.60;

        nomes[6] = "Tangerina";
        precos[6] = 12.30;

        JOptionPane.showMessageDialog(null, " Menu " +
        "\nNomes                    Preços "+
        "\n" + nomes[0] + "            " + precos[0] +
        "\n" + nomes[1] + "            " + precos[1] +
        "\n" + nomes[2] + "            " + precos[2] +
        "\n" + nomes[3] + "            " + precos[3] +
        "\n" + nomes[4] + "            " + precos[4] +
        "\n" + nomes[5] + "            " + precos[5] +
        "\n" + nomes[6] + "            " + precos[6] );


    }
}