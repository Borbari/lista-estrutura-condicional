import javax.swing.JOptionPane;
public class testefor {

	public static void main(String[] args){
		
		String text = "";
		String[] tam = new String[5];
		
		for(int i=0; i< tam.length; i++){
			tam[i] = JOptionPane.showInputDialog("Digite o "+(i+1)+"� tamanho das pe�as");
			text = text + tam[i]+"\n";
			tamPP = tamPP + tam[i];
		
				
		
		
		
		
		
		}
		JOptionPane.showMessageDialog(null, "Tamanho de todas camisas: " + text);
		
	}
}
