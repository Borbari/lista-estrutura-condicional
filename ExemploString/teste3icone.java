import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class teste3icone{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "Olá Mundo",
        "Sistema da Vovó", JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
                teste3icone.class.getResource
            ("/Imagem/mobile.png")
        )
        
        );



    }



}