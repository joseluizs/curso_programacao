package curso_programacao;

import java.util.Scanner;

public class ExercAula37_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Digite um n�mero! ");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("N�mero negativo!");
		}else {
			System.out.println("N�mero N�o negativo!");
		}
		sc.close();
	}

}
