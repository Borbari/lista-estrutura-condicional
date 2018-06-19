import java.awt.Color;
import javax.swing.JFrame;
public class ExemploJFrame01{
	
	public static void mais(String[]args){

		//cria uma tela
		JFrame tela = new JFrame();

		//define o tamanho da janela
		//width ↔  , height ↕
		tela.setSize(500,500);

		//diz que o layout é nulo
		tela.setLayout(null);

		//passando nulo ele centraliza a janela
		tela.setLocationRelativeTo(null);

		//diz que quando o usuário fechar a aplicaçao irá encerrar o aplicativo
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//define o titulo da janela
		tela.setTitle("HELLO WORLD");

		//import java.awt.color;
		//tela.getContentPane().setBackground(color.red);
		tela.getContentPane().setBackground(Color.decode("#b3fc2a"));
		
		//apresenta a tela
		tela.show();
	}
}