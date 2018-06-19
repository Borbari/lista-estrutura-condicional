import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	//criando GUI
	public TelaLogin() {
		super("Autenticação");
		this.setLocationRelativeTo(null);
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		//criando componentes na GUI
		JLabel userLabel = new JLabel("Usuário: ");
		JLabel passLabel = new JLabel("Senha: ");
		JTextField userTextField = new JTextField(10);
		JPasswordField userPasswordField = new JPasswordField(10);
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Cancelar");		
		constraints.insets = new Insets(3, 3, 3, 3);
		constraints.anchor = GridBagConstraints.EAST;
		addComponent(userLabel, 0, 0, 1, 1);
		addComponent(userTextField, 0, 1, 1, 1);
		addComponent(passLabel, 1, 0, 1, 1);
		addComponent(userPasswordField, 1, 1, 1, 1);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		addComponent(okButton, 2, 0, 1, 1);
		addComponent(cancelButton, 2, 1, 1, 1);		
	}
	private void addComponent(Component component, int linha, int coluna, int largura, int altura) {
		constraints.gridx = coluna;
		constraints.gridy = linha;
		constraints.gridwidth = largura;
		constraints.gridheight = altura;
		layout.setConstraints(component, constraints);
		add(component);
                botao.addActionListener(new ActionListener(){
			public void actionPerfomed(ActionEvent e){
				String jogoSelecionado = caixaDeSelecao.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "Jogo Selecionado: "+ jogoSelecionado);
			}
        
        
        }
}