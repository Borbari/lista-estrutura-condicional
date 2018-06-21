/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class AtalhoTelaDigitar {
      public static void main(String[]args){
        for (int i =0; i < 10;i++){
            System.out.println("public void acaoJButton0" + i + "(){");
            System.out.println("jButton0" + i + ".addActionListener(new ActionListener(){");
            System.out.print("@Override");
            System.out.print("public void actionPerformed(ActionEvent e) {");
            System.out.print("}");
            System.out.print("});");
            System.out.print("}");
            System.out.print("");
        }
    }
    
}
