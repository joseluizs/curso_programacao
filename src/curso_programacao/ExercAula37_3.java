package curso_programacao;

import java.util.Scanner;

public class ExercAula37_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos!");
		} else {
			System.out.println("N�o s�o multiplos!" + "");
		}
		sc.close();
	}

}
