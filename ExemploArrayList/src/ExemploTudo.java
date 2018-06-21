
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * @author Alunos
 */
public class ExemploTudo {

    private JButton jButton00,
            jButton01,
            jButton02,
            jButton03,
            jButton04,
            jButton05,
            jButton06,
            jButton07,
            jButton08,
            jButton09;
    private JFrame jFrame;

    public ExemploTudo(){
        gerarTela();
        acaoJButton00();
        adicionarComponentes();
        instanciarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        acaoJButton00();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
    }
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public void adicionarComponentes() {
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
    }

    public void instanciarComponentes() {
        jButton00 = new JButton("Exemplo 00");
        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");
    }

    public void gerarLocalizacoes() {
        jButton00.setLocation(10,10);
    }

    public void gerarDimensoes() {
        jButton00.setSize(100,100);
    }

    public void acaoBotaoLimpar() {
    }

    public void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo02();
            }
        });
    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
