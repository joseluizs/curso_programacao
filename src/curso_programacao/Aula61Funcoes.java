package curso_programacao;

import java.util.Scanner;

public class Aula61Funcoes {

	public static void main(String[] args) {
		/*
		 * double x = Math.sqrt(25.0);// Função raiz quadrada nativa
		 * 
		 * System.out.println(x);
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);// usando uma função pra calcular o maior

		showResult(higher);//usando uma função pra imprimir na tela

		sc.close();

	}
	
	//Função com retorno
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	//Função sem retorno
	public static void showResult(int value) {
		System.out.println("Higher = : " + value);
	}

}
