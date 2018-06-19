import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ExemploSistema01{

	public static void main(String[]args){

		JFrame tela = new JFrame("Meu primeiro campo");
		tela.setSize(500,500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel labelNome = new JLabel("Nome");
		JLabel labelItens = new JLabel("Itens");
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoEditar = new JButton("EDitar");
		JButton botaoApagar = new JButton("Apagar");

		JTextField campoNome = new JTextField();
		JComboBox caixaSelecaoItens = new JComboBox();

		labelNome.setSize(50, 20);
		labelItens.setSize(50, 20);
		botaoCadastrar.setSize(150, 30);
		botaoEditar.setSize(150, 30);
		botaoApagar.setSize(150, 30);
		campoNome.setSize(450, 20);
		caixaSelecaoItens.setSize(450, 20);

		labelNome.setLocation(10, 10);
		campoNome.setLocation(65, 10);
		botaoCadastrar.setLocation(10, 35);
		botaoEditar.setLocation(165, 35);
		botaoApagar.setLocation(320, 35);
		labelItens.setLocation(10, 70);
		caixaSelecaoItens.setLocation(65, 70);

		tela.add(labelNome);
		tela.add(labelItens);
		tela.add(botaoCadastrar);
		tela.add(botaoEditar);
		tela.add(botaoApagar);
		tela.add(campoNome);
		tela.add(caixaSelecaoItens);

		botaoCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cadastrar();
				
					});

		botaoEditar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				editar();
				}
			});

				
		tela.setVisible(true);
				}
				

				
	

		private static void cadastrar(){
				
				String nome = campoNome.getText().trim();
				if(editar.isEmpty()){
					JOptionPane.showMessageDialog(null, " Informe um nome");
					return;
				}
				if(nome.length() < 3){
					JOptionPane.showMessageDialog(null, " Informe no minimo 3 caracteres!");
					return;
				}
				caixaSelecaoItens.addItem(editar);
				campoNome.setText("");
				JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso!");

			}


			}
			private static void editar(){
		}

}
