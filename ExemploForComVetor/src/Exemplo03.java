import javax.swing.JOptionPane;

public class Exemplo03 {

	public static void main(String[] args) {
		
		int[] codigos = new int[3];
		String[] nomes = new String[3];
		
		for(int i = 0; i < codigos.length; i++){
			nomes[i] = JOptionPane.showInputDialog(null, "Digite o nome " + (i + 1));
			codigos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo " + (i + 1)));
			
		}
		for(int i = 0; i < codigos.length; i++){
			System.out.print(
					"\nNome: " + nomes[i] +
					"\nCodigo: " + codigos[i]);
		}

	}

}
