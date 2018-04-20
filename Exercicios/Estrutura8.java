import javax.swing.JOptionPane;

   public class Estrutura8{

      public static void main(String[] args){
       
        int soma1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu pedido!"+

          "\n\nTipo                        Nome                                        Valor     "+ 
          "\n1-Bolos               Bolo Brigadeiro                               R$ 29.50    "+
          "\n2-Bolos               Bolo Floresta Negra                           R$ 2.00     "+
          "\n3-Bolos               Bolo Leite com Nutella                        R$ 29.23    "+
          "\n4-Bolos               Bolo Mousse de Chocolate                      R$ 7.10     "+
          "\n5-Bolos               Bolo Nega Maluca                              R$ 19.33    "+
          "\n6-Doces               Bomba de Creme                                R$ 17.71    "+
          "\n7-Doces               Bomba de Morango                              R$ 4.82     "+
          "\n8-Sanduiches          Filé-Mignon com fritas e cheddar              R$ 21.16    "+
          "\n9-Sanduiches          Hambúrguer com queijos.champignon e rúcula    R$ 12.70    "+
          "\n10-Sanduiches          Provolone com salame                          R$ 19.70    "+
          "\n11-Sanduiches          Vegetariano de berinjela                      R$ 28.22    "+
          "\n12-Pizzas              Calabresa                                     R$ 8.98     "+
          "\n13-Pizzas              Napolitana                                    R$ 0.42     "+
          "\n14-Pizzas              Peruana                                       R$ 18.36    "+
          "\n15-Pizzas              Portuguesa                                    R$ 27.50    "));
        int soma2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu segundo pedido!"+

          "\n\nTipo                        Nome                                        Valor     "+ 
          "\n1-Bolos               Bolo Brigadeiro                               R$ 29.50    "+
          "\n2-Bolos               Bolo Floresta Negra                           R$ 2.00     "+
          "\n3-Bolos               Bolo Leite com Nutella                        R$ 29.23    "+
          "\n4-Bolos               Bolo Mousse de Chocolate                      R$ 7.10     "+
          "\n5-Bolos               Bolo Nega Maluca                              R$ 19.33    "+
          "\n6-Doces               Bomba de Creme                                R$ 17.71    "+
          "\n7-Doces               Bomba de Morango                              R$ 4.82     "+
          "\n8-Sanduiches          Filé-Mignon com fritas e cheddar              R$ 21.16    "+
          "\n9-Sanduiches          Hambúrguer com queijos.champignon e rúcula    R$ 12.70    "+
          "\n10-Sanduiches          Provolone com salame                          R$ 19.70    "+
          "\n11-Sanduiches          Vegetariano de berinjela                      R$ 28.22    "+
          "\n12-Pizzas              Calabresa                                     R$ 8.98     "+
          "\n13-Pizzas              Napolitana                                    R$ 0.42     "+
          "\n14-Pizzas              Peruana                                       R$ 18.36    "+
          "\n15-Pizzas              Portuguesa                                    R$ 27.50    "));
        int soma3 = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu terceiro pedido!" + 

          "\n\nTipo                        Nome                                        Valor     "+ 
          "\n1-Bolos               Bolo Brigadeiro                               R$ 29.50    "+
          "\n2-Bolos               Bolo Floresta Negra                           R$ 2.00     "+
          "\n3-Bolos               Bolo Leite com Nutella                        R$ 29.23    "+
          "\n4-Bolos               Bolo Mousse de Chocolate                      R$ 7.10     "+
          "\n5-Bolos               Bolo Nega Maluca                              R$ 19.33    "+
          "\n6-Doces               Bomba de Creme                                R$ 17.71    "+
          "\n7-Doces               Bomba de Morango                              R$ 4.82     "+
          "\n8-Sanduiches          Filé-Mignon com fritas e cheddar              R$ 21.16    "+
          "\n9-Sanduiches          Hambúrguer com queijos.champignon e rúcula    R$ 12.70    "+
          "\n10-Sanduiches          Provolone com salame                          R$ 19.70    "+
          "\n11-Sanduiches          Vegetariano de berinjela                      R$ 28.22    "+
          "\n12-Pizzas              Calabresa                                     R$ 8.98     "+
          "\n13-Pizzas              Napolitana                                    R$ 0.42     "+
          "\n14-Pizzas              Peruana                                       R$ 18.36    "+
          "\n15-Pizzas              Portuguesa                                    R$ 27.50    "));
        
        String pedido1 = ""; 
        String pedido2 = "";
        String pedido3 = "";

        double valor1 = 0;
        double valor2 = 0;
        double valor3 = 0;

        if (soma1 == 1){
          pedido1 = "Bolo Brigadeiro";
          valor1 = 29.50;
        }
        else if (soma1 == 2){
          pedido1 = "Bolo Floresta Negra";
          valor1 = 2.00;
        }
        else if (soma1 == 3){
          pedido1 = "Bolo Leite com Nutella";
          valor1 = 29.23;
        }
        else if (soma1 == 4){
          pedido1 = "Bolo Mousse de Chocolate";
          valor1 = 7.10;
        }
        else if (soma1 == 5){
          pedido1 = "Bolo Nega Maluca";
          valor1 = 19.33;
        }
        else if (soma1 == 6){
          pedido1 = "Bomba de Creme";
          valor1 = 17.71;
        }
        else if (soma1 == 7){
          pedido1 = "Bomba de Morango";
          valor1 = 4.82;
        }
        else if (soma1 == 8){
          pedido1 = "Filé-Mignon com fritas e cheddar";
          valor1 = 21.16;
        }
        else if (soma1 == 9){
          pedido1 = "Hambúrguer com queijos. champignon e rúcula";
          valor1 = 12.70;
        }
        else if (soma1 == 10){
          pedido1 = "Provolone com salame";
          valor1 = 19.70;
        }
        else if (soma1 == 11){
          pedido1 = "Vegetariano de berinjela";
          valor1 = 28.22;
        }
        else if (soma1 == 12){
          pedido1 = "Calabresa";
          valor1 = 8.98;
        }
        else if (soma1 == 13){
          pedido1 = "Napolitana";
          valor1 = 0.42;
        }
        else if (soma1 == 14){
          pedido1 = "Peruana";
          valor1 = 18.36;
        }
        else if (soma1 == 15){
          pedido1 = "Portuguesa";
          valor1 = 27.50;
        }
        
        //soma 2
        
        if (soma2 == 1){
          pedido2 = "Bolo Brigadeiro";
          valor2 = 29.50;
        }
        else if (soma2 == 2){
          pedido2 = "Bolo Floresta Negra";
          valor2 = 2.00;
        }
        else if (soma2 == 3){
          pedido2 = "Bolo Leite com Nutella";
          valor2 = 29.23;
        }
        else if (soma2 == 4){
          pedido2 = "Bolo Mousse de Chocolate";
          valor2 = 7.10;
        }
        else if (soma2 == 5){
          pedido2 = "Bolo Nega Maluca";
          valor2 = 19.33;
        }
        else if (soma2 == 6){
          pedido2 = "Bomba de Creme";
          valor2 = 17.71;
        }
        else if (soma2 == 7){
          pedido2 = "Bomba de Morango";
          valor2 = 4.82;
        }
        else if (soma2 == 8){
          pedido2 = "Filé-Mignon com fritas e cheddar";
          valor2 = 21.16;
        }
        else if (soma2 == 9){
          pedido2 = "Hambúrguer com queijos. champignon e rúcula";
          valor2 = 12.70;
        }
        else if (soma2 == 10){
          pedido2 = "Provolone com salame";
          valor2 = 19.70;
        }
        else if (soma2 == 11){
          pedido2 = "Vegetariano de berinjela";
          valor2 = 28.22;
        }
        else if (soma2 == 12){
          pedido2 = "Calabresa";
          valor2 = 8.98;
        }
        else if (soma2 == 13){
          pedido2 = "Napolitana";
          valor2 = 0.42;
        }
        else if (soma2 == 14){
          pedido2 = "Peruana";
          valor2 = 18.36;
        }
        else if (soma2 == 15){
          pedido2 = "Portuguesa";
          valor2 = 27.50;
        }
        //soma 3
        
        if (soma3 == 1){
          pedido3 = "Bolo Brigadeiro";
          valor3 = 29.50;
        }
        else if (soma3 == 2){
          pedido3 = "Bolo Floresta Negra";
          valor3 = 2.00;
        }
        else if (soma3 == 3){
          pedido3 = "Bolo Leite com Nutella";
          valor3 = 29.23;
        }
        else if (soma3 == 4){
          pedido3 = "Bolo Mousse de Chocolate";
          valor3 = 7.10;
        }
        else if (soma3 == 5){
          pedido3 = "Bolo Nega Maluca";
          valor3 = 19.33;
        }
        else if (soma3 == 6){
          pedido3 = "Bomba de Creme";
          valor3 = 17.71;
        }
        else if (soma3 == 7){
          pedido3 = "Bomba de Morango";
          valor3 = 4.82;
        }
        else if (soma3 == 8){
          pedido3 = "Filé-Mignon com fritas e cheddar";
          valor3 = 21.16;
        }
        else if (soma3 == 9){
          pedido3 = "Hambúrguer com queijos. champignon e rúcula";
          valor3 = 12.70;
        }
        else if (soma3 == 10){
          pedido3 = "Provolone com salame";
          valor3 = 19.70;
        }
        else if (soma3 == 11){
          pedido3 = "Vegetariano de berinjela";
          valor3 = 28.22;
        }
        else if (soma3 == 12){
          pedido3 = "Calabresa";
          valor3 = 8.98;
        }
        else if (soma3 == 13){
          pedido3 = "Napolitana";
          valor3= 0.42;
        }
        else if (soma3 == 14){
          pedido3 = "Peruana";
          valor3= 18.36;
        }
        else if (soma3 == 15){
          pedido3= "Portuguesa";
          valor3 = 27.50;
        }
        double total = valor1+valor2+valor3;
        JOptionPane.showMessageDialog(null, "Primeiro Pedido: " + pedido1 +" R$"+ valor1 +
         "\nSegundo Pedido: " + pedido2 +" R$"+  valor2 +
         "\nTerceiro Pedido: " +pedido3 +" R$"+ valor3 +
         "\nTotal: R$" + String.format("%.2f",total));
      
      }  
   }