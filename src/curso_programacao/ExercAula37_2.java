package curso_programacao;

import java.util.Scanner;

public class ExercAula37_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número! ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Par!");
		} else {
			System.out.println("Impar!");
		}
		sc.close();
	}
}
