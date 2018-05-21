import javax.swing.JOptionPane;
public class ForcomVetor2 {

	public static void main(String[] args) {
		
		int[] idade = new int[7];
		String texto = "";
		for(int i=0; i<7; i++){
		idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a sua idade" ,"Idade nº" + (i+1), JOptionPane.QUESTION_MESSAGE));
			texto = texto + idade[i] + "\n";
		}
		JOptionPane.showMessageDialog(null,"Idade: \n" + texto);
		
				
		
	}
}
