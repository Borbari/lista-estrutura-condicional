
package Exercicio00;

import java.awt.Color;
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
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Alunos
 */
public class Exercicio00JButtonTela implements Exercicio00Interface {
    private JFrame jFrame;
    private JCheckBox jCheckBoxAdestrado, jCheckBoxVacinado, jCheckBoxCastrado, jCheckBoxPedigree;
    private JButton jButtonCancelar, jButtonSalvar, botao; 
    private JLabel  labelNome, labelIdade, labelApelido, labelPreco, labelRaca, jLabelDescricao;
    private JTextField campoNome, campoIdade, campoApelido, campoPreco;
    private JComboBox caixaDeSelecao;
    private JRadioButton jRadioButtonCome, jRadioButtonVivo, jRadioButtonMorto,jRadioButtonRacao;
    private JScrollPane jScrollPane;
    private JTextArea jTextArea;       
            
            
    public Exercicio00JButtonTela(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoLimpar();
        acaoBotaoSalvar();
        caixaS();
        configurarJScrollpane();
        jFrame.setVisible(true);
    }
            
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(600, 415);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.getContentPane().setBackground(Color.decode("#4286f4"));
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
        jFrame.add(labelRaca);
        jFrame.add(jRadioButtonCome);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jLabelDescricao);
        jFrame.add(jScrollPane);
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
        labelRaca = new JLabel("Raça");
        jRadioButtonCome = new JRadioButton("Come almoços, jantas");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonRacao = new JRadioButton("Ração");
        jScrollPane = new JScrollPane();
        jTextArea = new JTextArea();
        jLabelDescricao = new JLabel("Descrição");
        jScrollPane.setViewportView(jTextArea);
    }

    @Override
    public void gerarLocalizacoes() {
        jButtonCancelar.setLocation(315, 320);
        jButtonSalvar.setLocation(455, 320);
        jCheckBoxAdestrado.setLocation(335, 140);
        jCheckBoxCastrado.setLocation(455, 140);
        jCheckBoxVacinado.setLocation(335, 160);
        jCheckBoxPedigree.setLocation(455, 160);
        labelNome.setLocation(10,10);
        campoNome.setLocation(10, 30);
        labelIdade.setLocation(395, 10);
        campoIdade.setLocation(395,30);
        labelApelido.setLocation(185,60);
        campoApelido.setLocation(185,95);
        labelPreco.setLocation(395, 60);
        campoPreco.setLocation(395, 95);
        labelRaca.setLocation(10, 60);
        caixaDeSelecao.setLocation(10, 95);
        botao.setLocation(45, 95);
        jRadioButtonCome.setLocation(120, 160);
        jRadioButtonRacao.setLocation(120, 140);
        jRadioButtonMorto.setLocation(10, 160);
        jRadioButtonVivo.setLocation(10, 140);
        jLabelDescricao.setLocation(10, 210);
        jScrollPane.setLocation(10, 235);
        
    }
    @Override
    public void gerarDimensoes() {
        jButtonCancelar.setSize(130, 60);
        jButtonSalvar.setSize(130, 60);
        jCheckBoxAdestrado.setSize(120, 20);
        jCheckBoxCastrado.setSize(120, 20);
        jCheckBoxVacinado.setSize(120, 45);
        jCheckBoxPedigree.setSize(120, 45);
        labelNome.setSize(340,15);
        campoNome.setSize(340, 25);
        labelIdade.setSize(190, 15);
        campoIdade.setSize(190, 25);
        labelApelido.setSize(160, 25);
        campoApelido.setSize(165,25);
        labelPreco.setSize(190, 25);
        campoPreco.setSize(190, 25);
        caixaDeSelecao.setSize(160,25);
        labelRaca.setSize(40, 30);
        jRadioButtonCome.setSize(160, 45);
        jRadioButtonRacao.setSize(100, 20);
        jRadioButtonMorto.setSize(100, 45);
        jRadioButtonVivo.setSize(100, 20);
        jLabelDescricao.setSize(70, 20);
        jScrollPane.setSize(580, 80);
    }
    public void configurarJScrollpane(){
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextArea.setLineWrap(true);
        }
    public void caixaS(){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel(new Object[]{
			"Labrador Escavador", "Pincher Cão do Inferno", "Husk Fake Fox"
		});
            caixaDeSelecao.setModel(modelo);
            caixaDeSelecao.setSelectedIndex(-1);
            botao.addActionListener ( new ActionListener(){
        public void actionPerformed(ActionEvent e) {
			
        
        if (caixaDeSelecao.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione algum jogo bom");
            return;
        }

        String jogoSelecionado = caixaDeSelecao.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "Jogo Selecionado: " + jogoSelecionado);
    }
});
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
                jRadioButtonCome.setSelected(false);
                jRadioButtonMorto.setSelected(false);
                jRadioButtonRacao.setSelected(false);
                jRadioButtonVivo.setSelected(false);
                caixaDeSelecao.setSelectedIndex(-1);
                campoApelido.setText("");
                campoNome.setText("");
                campoIdade.setText("");
                campoPreco.setText("");
            }
        });
    }

    @Override
    public void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nome = campoNome.getText().trim();
                String apelido = campoApelido.getText().trim();
                
                if(nome.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo nome em branco");
                    return;
                }
                
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
                if(!jRadioButtonCome.isSelected()){
                    return;
                }
                if(!jRadioButtonMorto.isSelected()){
                    return;
                }
                if(!jRadioButtonRacao.isSelected()){
                    return;
                }
                if(!jRadioButtonVivo.isSelected()){
                    return;
                }
            }
        
        });
    }
}