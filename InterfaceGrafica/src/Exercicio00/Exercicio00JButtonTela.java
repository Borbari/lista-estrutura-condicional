
package Exercicio00;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Alunos
 */
public class Exercicio00JButtonTela implements Exercicio00Interface {
    private JFrame jFrame;
    private JCheckBox jCheckBoxAdestrado, jCheckBoxVacinado, jCheckBoxCastrado, jCheckBoxPedigree;
    private JButton jButtonCancelar, jButtonSalvar, botao;
    private JLabel  labelNome, labelIdade, labelApelido, labelPreco;
    private JTextField campoNome, campoIdade, campoApelido, campoPreco;
    private JComboBox caixaDeSelecao;
            
    public Exercicio00JButtonTela(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoLimpar();
        acaoBotaoSalvar();
        caixaS();
        caixaBotao();
        jFrame.setVisible(true);
    }
            
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(600, 415);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxPedigree);
        jFrame.add(jButtonCancelar);
        jFrame.add(jButtonSalvar);
        jFrame.add(labelNome);
        jFrame.add(campoNome);
        jFrame.add(labelIdade);
        jFrame.add(campoIdade);
        jFrame.add(labelApelido);
        jFrame.add(campoApelido);
        jFrame.add(labelPreco);
        jFrame.add(campoPreco);
        jFrame.add(caixaDeSelecao);
    }

    @Override
    public void instanciarComponentes() {
        jButtonCancelar = new JButton("Cancelar");
        jButtonSalvar = new JButton("Salvar");
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxPedigree = new JCheckBox("Tem Pedigree");
        labelNome = new JLabel("Nome");
        campoNome = new JTextField();
        labelIdade = new JLabel("Idade");
        campoIdade = new JTextField();
        labelApelido = new JLabel("Apelido");
        campoApelido = new JTextField();
        labelPreco = new JLabel("Preço");
        campoPreco = new JTextField();
        caixaDeSelecao = new JComboBox();
        botao = new JButton("Obter");
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonCancelar.setLocation(315, 340);
        jButtonSalvar.setLocation(455, 340);
        jCheckBoxAdestrado.setLocation(335, 160);
        jCheckBoxCastrado.setLocation(455, 160);
        jCheckBoxVacinado.setLocation(335, 185);
        jCheckBoxPedigree.setLocation(455, 185);
        labelNome.setLocation(10,40);
        campoNome.setLocation(10, 55);
        labelIdade.setLocation(395, 40);
        campoIdade.setLocation(395,55);
        labelApelido.setLocation(185,95);
        campoApelido.setLocation(185,115);
        labelPreco.setLocation(395, 95);
        campoPreco.setLocation(395, 115);
        caixaDeSelecao.setLocation(85, 10);
        botao.setLocation(45, 35);
        
    }
    public void caixaS(){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{
			"Labrador", "Pincher", "Husk"
		});
            caixaDeSelecao.setModel(modelo);
            caixaDeSelecao.setSelectedIndex(-1);
            botao.addActionListener ( new ActionListener(){
        public void actionPerformed(ActionEvent e) {
			
        
        if (caixaDeSelecao.getSelectedItem() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione algum jogo bom");
            return;
        }

        String jogoSelecionado = caixaDeSelecao.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "Jogo Selecionado: " + jogoSelecionado);
    }
});
    }
    @Override
    public void gerarDimensoes() {
        jButtonCancelar.setSize(130, 60);
        jButtonSalvar.setSize(130, 60);
        jCheckBoxAdestrado.setSize(120, 25);
        jCheckBoxCastrado.setSize(120, 25);
        jCheckBoxVacinado.setSize(120, 25);
        jCheckBoxPedigree.setSize(120, 25);
        labelNome.setSize(340,15);
        campoNome.setSize(340, 25);
        labelIdade.setSize(190, 15);
        campoIdade.setSize(190, 25);
        labelApelido.setSize(160, 25);
        campoApelido.setSize(165,25);
        labelPreco.setSize(190, 25);
        campoPreco.setSize(190, 25);
        caixaDeSelecao.setSize(200,20);
        botao.setSize(150,20);
    }

    @Override
    public void acaoBotaoLimpar() {
        jButtonCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jCheckBoxAdestrado.setSelected(false);
                jCheckBoxCastrado.setSelected(false);
                jCheckBoxVacinado.setSelected(false);
                jCheckBoxPedigree.setSelected(false);
            }
        });
    }

    @Override
    public void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(!jCheckBoxAdestrado.isSelected()){
                    return;
                }
                if(!jCheckBoxCastrado.isSelected()){
                    return;
                }
                if(!jCheckBoxVacinado.isSelected()){
                    return;
                }
                if(!jCheckBoxPedigree.isSelected()){
                    return;
                }
            }
        
        });
    }
}