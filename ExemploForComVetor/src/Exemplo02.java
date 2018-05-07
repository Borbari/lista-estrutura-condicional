import java.util.Scanner;
public class Exemplo02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de " + "nomes que deseja cadastrar");
		int quantidadeRegistros = Integer.parseInt(teclado.nextLine());
		
		String[] nomes = new String[quantidadeRegistros];
		int[] idades = new int[quantidadeRegistros];
		double[] pesos = new double[quantidadeRegistros];
		for(int i = 0; i < nomes.length; i++){
			System.out.print("Nome: ");
			nomes[i] = teclado.nextLine();
			
			System.out.print("Idade: ");
			idades[i] = Integer.parseInt(teclado.nextLine());
			
			System.out.print("Peso: ");
			pesos[i] = Double.parseDouble(teclado.nextLine());
			}
			
			
			int somaIdades = 0;
			for(int i = 0; i < idades.length; i++){
				somaIdades = somaIdades + idades[i];
			}
			System.out.println("A soma das idades é: " + somaIdades);
			double media = somaIdades / idades.length;
			
			int menorIdade = Integer.MAX_VALUE;
			for(int i = 0; i < idades.length; i++){
				int idadeAtual = idades[i];
			
				if(idadeAtual < menorIdade){
					menorIdade = idadeAtual;
					
				}
			}
			int maiorIdade = Integer.MIN_VALUE;
			for(int i = idades.length - 1; i >= 0 ; i--){
				
				if(idades[i] > maiorIdade){
					maiorIdade = idades[i];
				}
			}System.out.println("Media: " + media +
					"\nMaior Idade: " + maiorIdade +
					"\nMenor idade: " + menorIdade +
					"\nA soma das idades é: " + somaIdades);
				}
			
	
	}

