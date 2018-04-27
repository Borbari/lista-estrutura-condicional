import javax.swing.JOptionPane;
public class Exer6{
    public static void main(String[] args){
        
        double quantidade = 0;
        double sair = 0;
        double valor = 0;
        double somaTotal = 0;
        int nBolos = 0;
        int nDoces = 0;
        int nSanduiches = 0;
        int nPizzas = 0;




        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Faça seu pedido!"  +
            "\n\nCódigo           Tipo                 Nome                        valor" +
            "\n1               Bolos           Bolo Brigadeiro                  R$ 29.50 "+
            "\n2               Bolos           Bolo Floresta Negra              R$ 2.00 "+
            "\n3               Bolos           Bolo Leite com Nutella           R$ 29.23 "+
            "\n4               Bolos           Bolo Mousse de Chocolate         R$ 7.10 "+
            "\n5               Bolos           Bolo Nega Maluca                 R$ 19.33 "+
            "\n6               Doces           Bomba de Creme                   R$ 17.71 "+
            "\n7               Doces           Bomba de Morango                 R$ 4.82 "+
            "\n8               Sanduíches      Filé-Mignon com fritas e cheddar R$ 21.16 "+
            "\n9               Sanduíches      Hambúrguer com queijos           R$ 12.70 "+
            "\n10              Sanduíches      Provolone com salame             R$ 19.70 "+
            "\n11              Sanduíches      Vegetariano de berinjela         R$ 28.22 "+
            "\n12              Pizzas          Calabresa                        R$ 8.98 "+
            "\n13              Pizzas          Napolitana                       R$ 0.42 "+
            "\n14              Pizzas          Peruana                          R$ 18.36 "+
            "\n15              Pizzas          Portuguesa                       R$ 27.50 "+
            "\n16              Sair "));
        
        while(codigo < 15 && codigo > 0){
        
        
            
             
            

            if (codigo == 1){
                nBolos = nBolos + 1;
                quantidade = quantidade + 1;valor = 29.50;
                }else if (codigo == 2){
                    nBolos = nBolos + 1;
                    quantidade = quantidade + 1;valor =  2.00;
                }else if (codigo == 3){
                    nBolos = nBolos + 1;
                    quantidade = quantidade + 1;valor =  29.23 ;
                }else if (codigo == 4){
                    nBolos = nBolos + 1;
                    quantidade = quantidade + 1;valor = 7.10;
                }else if (codigo == 5){
                    nBolos = nBolos + 1;
                    quantidade = quantidade + 1;valor = 19.33;
                }else if (codigo == 6){
                    nDoces = nDoces  + 1;
                    quantidade = quantidade + 1;valor = 17.71;
                }else if (codigo == 7){
                    nDoces = nDoces  + 1;
                    quantidade = quantidade + 1;valor = 4.82;
                }else if (codigo == 8){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor =  21.16;
                }else if (codigo == 9){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor = 12.70;
                }else if (codigo == 10){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor= 19.70;
                }else if (codigo == 11){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor = 28.22;
                }else if (codigo == 12){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor = 8.98;
                }else if (codigo == 13){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor = 0.42;
                }else if (codigo == 14){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor = 18.36;
                }else if (codigo == 15){
                    nSanduiches = nSanduiches + 1;
                    quantidade = quantidade + 1;valor = 27.50;
                }
                
                somaTotal = somaTotal + valor;
                }
        
        codigo = Integer.parseInt(JOptionPane.showMessageDialog(null, "Conta" +
        "\nA quantidade de bolos escolhidos: " + nBolos +
        "\nA quantidade de doces escolhidos: " + nDoces +
        "\nA quantidade de Sanduíches escolhidos: " + nSanduiches + 
        "\nA quantidade de pizzas escolhidas: " + nPizzas +
        "\nA média dos produtos: " + (somaTotal/quantidade) + 
        "\n total dos pedidos: " + somaTotal +
        "\n quantidade de produtos consumidos: " + nBolos ));
        
    
    }
}