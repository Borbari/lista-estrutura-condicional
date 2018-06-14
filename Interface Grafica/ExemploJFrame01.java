public class ExemploJFrame01{
	
	public static void mais(String[]args){

		//cria uma tela
		JFrame tela = new JFrame();

		//define o tamanho da janela
		tela.setSize(500,500);

		//diz que o layout é nulo
		tela.setLayout(null);

		//passando nulo ele centraliza a janela
		tela.setLocationRelativeTo(null);

		//diz que quando o usuário fechar a aplicaçao irá encerrar o aplicativo
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		tela.show();
	}
}