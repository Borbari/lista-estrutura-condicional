import javax.swing.JOptionPane;
public class ForcomVetor1 {

	public static void main(String[] args) {
		
		String[] nomes= new String [25];
		String texto = "";
		for(int i=0; i<2; i++){
			nomes[i] = JOptionPane.showInputDialog(null,"Digite o nome" ,"Nome nº" + (i+1), JOptionPane.QUESTION_MESSAGE);
			texto = texto + nomes[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, "Nomes: \n" + texto);
		
		}		
	}
