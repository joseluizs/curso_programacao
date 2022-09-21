/* Fazer um programa pra ler uma temperatura em Celsius e mostrar o equivalente
 * em Fahrenheit. Pergutar se o usuário deseja repetir(s/n). Caso o usuário digite "S", 
 * repetir o programa.*/

package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula55 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		char resposta;
		do{
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = ler.nextDouble();
			double far = 9.0 * celsius / 5.0 + 32.0;
			
			System.out.printf("Equivanlente em Fahrenheit: %.1f%n", far);
			System.out.print("Deseja repetir o calcúlo (s/n) ? ");
			resposta = ler.next().charAt(0);
		}while (resposta != 'n');		
		
		ler.close();
	}

}
