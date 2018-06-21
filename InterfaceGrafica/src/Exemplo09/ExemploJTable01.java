package Exemplo09;

import Exemplo08.JFrameBaseInterface;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Alunos
 */
public class ExemploJTable01 {
    
    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private JScrollPane jScrollPane;

    
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void instanciarComponentes() {
        jTable = new JTable();
            Object[]colunas = new Object[]
                {"Nome","Idade", "Altura"};
        configurarTableModel();
        defaultTableModel = new DefaultTableModel(colunas, 0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        jScrollPane = new JScrollPane(jTable);
        configurarTableModel();
    }
    private void configurarTableModel() {
        defaultTableModel.addRow(new Object[]{
           "Gustavo", 22, 1.68 
        });
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 21, 1.76
        });
        defaultTableModel.addRow(new Object[]{
            "Crispim", 20, 1.75
        });
        jTable.setModel(defaultTableModel);
        }         
    

    
    public void adicionarComponentes() {
        jFrame.add(jTable);
    }


    
    public void gerarLocalizacoes() {
        jTable.setLocation(10, 10);
    }

    
    public void gerarDimensoes() {
        jTable.setSize(400, 400);
    }
    


}
