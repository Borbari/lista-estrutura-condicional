import javax.swing.JOptionPane;
public class Estrutura16{
    public static void main(String[] args){
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog("temperatura a ser invertida"));
        double temperatura = 0;
        
        Object[] temp = {"Celsius","Fahrenheit", "Kelvin"};
        
        int origem = JOptionPane.showOptionDialog(null, 
        "Selicione uma origem",
        "Menu",
        0,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        temp,
        temp[0]
        );
        
        
        // Destino 
    
        int destino = JOptionPane.showOptionDialog(null, 
        "Selicione uma destino",
        "Menu",
        0,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        temp,
        temp[0]
        );

        if(origem == 0 && destino == 1){
            temperatura = valor*1.8+32;
        }
        else if(origem == 0 && destino == 2){
            temperatura = valor+273.15;
        }
        else if(origem == 1 && destino == 0){
            temperatura = (valor-32)/1.8;
        }
        else if(origem == 1 && destino == 2 ){
            temperatura = valor-273.15*1.8+32;
        }
        else if(origem == 2 && destino == 0 ){
            temperatura = valor-273.15;
        }
        else if(origem == 2 && destino == 1){
            temperatura = (valor-32)/1.8 + 273;
        }
        else if(origem == 0 && destino == 0){
            JOptionPane.showMessageDialog(null, "Já Está convertido");
        }
        else if(origem == 1 && destino == 1){
            JOptionPane.showMessageDialog(null, "Já Está convertido");
        }
        else if(origem == 2 && destino == 2){
            JOptionPane.showMessageDialog(null, "Já Está convertido");
        }
        else{}
               
        JOptionPane.showMessageDialog(null, "Origem: " + String.format("%.2f", valor) +temp [origem] +
        "\nDestino: " + String.format("%.2f",temperatura) + temp [destino]);
        
         
           
          

        
            
    }
}