import javax.swing.JOptionPane;
public class ForcomVetor3 {
	public static void main(String[] args) {
		
		int registro = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser registrada")); 
		double[] preco = new double[registro];
		double precoTotal = 0;
		String texto = "";
		
		for(int i=0; i<registro; i++){
			preco[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite preço" , "Preço Nº" + (i+1), JOptionPane.QUESTION_MESSAGE));	
			texto = texto + preco[i] + "\n" ;
			precoTotal = precoTotal + preco[i];
	}
			JOptionPane.showMessageDialog(null,"Preço: " + texto +
					"\nPreço Total: " + precoTotal);
		}	
	}

