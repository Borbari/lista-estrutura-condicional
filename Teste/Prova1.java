import javax.swing.JOptionPane;
public class Prova1{
    public static void main (String[] args){
        int prod = 0;
        double receita = 0, maiorRec = Integer.MIN_VALUE;
        String nome = "";
        double orcamento = 0, menorOrc = Integer.MAX_VALUE;
        int ano = 0, maiorAno = Integer.MIN_VALUE;
        String diretor = "";
        String descricao = "";



        int producoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas producoes deseja cadastrar"));

        while(prod < producoes){
               prod = prod + 1;
                
                nome = JOptionPane.showInputDialog("Nome produção?");
                ano = Integer.parseInt(JOptionPane.showInputDialog("lançamento?"));
                diretor = JOptionPane.showInputDialog("diretor?");
                orcamento = Double.parseDouble(JOptionPane.showInputDialog("orçamento?"));
                receita = Double.parseDouble(JOptionPane.showInputDialog("receita?"));
                descricao = JOptionPane.showInputDialog("descrição?");
                
                
                if (receita > maiorRec){
                    maiorRec = receita;
                }    
                if(orcamento < menorOrc){
                    menorOrc = orcamento;
                }
                }if(ano > maiorAno){
                    maiorAno = ano;
                }
                
                    JOptionPane.showMessageDialog(null, "Nome produçao: " + nome + 
                    "\nReceita Maior: " + maiorRec +
                    "\nNome produçao: " + nome + 
                    "\nMenor Orçamento: " + menorOrc +
                    "\nMaior ano: " + maiorAno);





        



    }

}