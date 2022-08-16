/**/

package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double soma = num1 + num2;
		
		System.out.println("A soma dos valores são: " + soma);
		
		sc.close();

	}

}