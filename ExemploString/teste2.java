import javax.swing.JOptionPane;

public class teste2{
   public static void main(String[] args){
     String opcaoSelecionada = JOptionPane.showInputDialog(null,
       "Selecione um estado",
       "Sistema - Da Voó",
       JOptionPane.QUESTION_MESSAGE,
       null,
       new Object[]{
           "Selecione um estado", "PR", "RS", "SC"
       },
       "SC"
     ).toString();
    System.out.println(opcaoSelecionada);
    if(opcaoSelecionada.equals("SC")){
        System.out.println("Santa Catarina");
    }else if(opcaoSelecionada.equals("PR")){
        System.out.println("Paraná");
    }else if(opcaoSelecionada.equals("RS")){
        System.out.println("Rio Grande do Sul");
    }
  }
}