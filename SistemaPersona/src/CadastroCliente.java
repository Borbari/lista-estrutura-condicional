
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Airam Vieira
 *
 */
public class CadastroCliente {

    /*int cadastrados = Integer.parseInt(JOptionPane.showInputDialog("Quantos usuários
     quer cadastrar?"));*/
    String[] nomes = new String[100];
    int[] idades = new int[100];
    char[] sexos = new char[100];
    String[] cpfs = new String[100];
    String[] estados = new String[100];
    String[] cidades = new String[100];
    String[] bairros = new String[100];
    String[] logradouros = new String[100];
    String[] ceps = new String[100];
    String[] numeros = new String[100];
    String[] complementos = new String[100];
    int atual = 0;
    
    public void cadastrar() {   
        solicitarInformacao(atual);
        atual++;
    }
    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += "Nome: " + nomes[i]
                    + "\nIdade: " + idades[i]
                    + "\nSexo: " + sexos[i]
                    + "\nCPF: " + cpfs[i]
                    + "\nEstado: " + estados[i]
                    + "\nCidade: " + cidades[i]
                    + "\nBairro: " + bairros[i]
                    + "\nLogradouro: " + logradouros[i]
                    + "\nCep: " + ceps[i]
                    + "\nNmero: " + numeros[i]
                    + "\nComplemento: " + complementos[i];
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void editar() {
       String busca = JOptionPane.showInputDialog("Digite o nome para editar");
       for(int i =0; i < atual; i++){
           if(nomes[i].equals(busca)) {
               solicitarInformacao(i);
               return;
           }
       }
        
    }

    public void contabilizarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        int quantidadeRegistros = 0;
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                quantidadeRegistros++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " registrados                                                 é: " + quantidadeRegistros);
    }
    
    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        
        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }
    
    public void buscarPeloCPF() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o cpf para busca").replace(".", "").replace("-", "");
        for (int i = 0; i < atual; i++) {
            if (cpfs[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
            }            
        }        
    }

    public void apresentarInformacao(int i) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomes[i]
                + "\nIdade: " + idades[i]
                + "\nSexo: " + sexos[i]
                + "\nCPF: " + cpfs[i]
                + "\nEstado: " + estados[i]
                + "\nCidade: " + cidades[i]
                + "\nBairro: " + bairros[i]
                + "\nLogradouro: " + logradouros[i]
                + "\nCep: " + ceps[i]
                + "\nNmero: " + numeros[i]
                + "\nComplemento: " + complementos[i]);
        
    }
    
    public void solicitarInformacao(int posicao) {
             nomes[posicao] = JOptionPane.showInputDialog("Digite seu nome");
        idades[posicao] = Integer.parseInt(JOptionPane.showInputDialog(nomes[posicao] + " digite sua idade"));
        sexos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite seu sexo").toUpperCase().charAt(0);
        cpfs[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite o cpf")
                .replace(".", "")
                .replace(".", "");
        estados[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite o seu Estado");
        cidades[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite a sua cidade");
        logradouros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite seu logradouro");
        bairros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite seu bairro");
        ceps[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite o seu cep");
        numeros[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite seu número");
        complementos[posicao] = JOptionPane.showInputDialog(nomes[posicao] + " digite seu complemento");
    
    }

}