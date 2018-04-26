import javax.swing.JOptionPane;
public class Exer4{
    public static void main(String[] args){
        
        int ano = 0;
        double valor = 0;
        int quant = 0;
        double somaValor = 0;
        int somaAno = 0;
        int quantCarros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de carros a ser cadastrada"));
        int letraG = 0;
        int letraA = 0;
        
        while(quant < quantCarros){         
            quant = quant + 1;
            String modelo = JOptionPane.showInputDialog(null, "Digite o modelo").trim();
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do carro"));
            ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano"));
            somaAno = somaAno + ano;
            somaValor = somaValor + valor ;

            char letra = modelo.charAt(0);
            if(letra == 'g'){
                letraG = letraG + 1;  
                }
            if(letra == 'a'){
                letraA = letraA + 1;                
                }
        }    
        JOptionPane.showMessageDialog(null, "Média do ano dos carros: " + (somaAno/quantCarros) +
            "\nMédia dos valores: " + (somaValor/quantCarros) +
            "\nCarro com a letra G: " + letraG +
            "\nCarro com a letra A: " + letraA);
    }
}