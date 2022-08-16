/*Ler um número inteiro N e calcular todos os seus divisores*/

package curso_programacao;

import java.util.Scanner;

public class ExercAula50_6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int num = leitor.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
		leitor.close();

	}

}
