import javax.swing.JOptionPane;
public class Prova2{
    public static void main(String[] args){
        
        double vendas = 0;
        double valorTotal = 0;
        int pecas = 0, maisPecas = Integer.MIN_VALUE, menosPecas = Integer.MAX_VALUE;
        double compras = 0;
        String nome = "";    
        
        while(!nome.equalsIgnoreCase("fim")){
            nome = JOptionPane.showInputDialog("Nome do comprador");
            pecas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças?"));
            compras = Double.parseDouble(JOptionPane.showInputDialog("valor Total da compra?"));
            vendas = vendas + pecas;
            valorTotal = valorTotal + compras;

            if(pecas > maisPecas ){
                maisPecas = pecas;
            }
            if(pecas < menosPecas){
                menosPecas = pecas;
            }   
            nome = JOptionPane.showInputDialog("\nSe desejar sair digite \"Fim\".");
        }
        JOptionPane.showMessageDialog(null, 
        "\nQuantidade de vendas realizada: "+ vendas +
        "\nValor total de todas as compras: "+ valorTotal +
        "\nMédia total de todas as compras: "+ (valorTotal/pecas) +
        "\nPedido com mais peças: " + maisPecas +
        "\nPedido com menos peças: "+ menosPecas);






    }
}