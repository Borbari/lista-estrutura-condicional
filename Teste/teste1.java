import javax.swing.JOptionPane;

   public class teste1{

      public static void main(String[] args){
     
        int opcao = JOptionPane.showOptionDialog(null, 
           "Selicione o meu desejado!", 
            "MENU DO SISTEMA",
            0,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            new Object[]{
               "Cadastro", "Edição", "Lista "
            },
            "Edição"
            );
            if(opcao == 0){
                JOptionPane.showMessageDialog(null,
                "Edição seliconada");
            }else if(opcao ==1){
                JOptionPane.showMessageDialog(null,
                "Cadastro selecionado");
            }else if(opcao ==2 ){
                JOptionPane.showMessageDialog(null,
                 "Lista selecionada");
            }    
            System.out.println(opcao);    
    

      }

   }