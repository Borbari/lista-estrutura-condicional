import javax.swing.JOptionPane;
public class ForcomVetor4 {

	public static void main(String[] args){
		
		String text = "";
		String[] tam = new String[5];
		for(int i=0; i< tam.length; i++){
			tam[i] = JOptionPane.showInputDialog("Digite o tamanho das pe�as");
			text = text + tam[i]+"\n";
		
		
				
		
		
		
		
		
		}
		JOptionPane.showMessageDialog(null, "Tamanho de todas camisas: " + text);
		
	}
}


