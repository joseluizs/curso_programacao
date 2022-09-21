/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, 
 * por definição, fatorial de 0 é 1.*/

package curso_programacao;

import java.util.Scanner;

public class ExercAula50_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int fat = 1;
		for(int i=1; i<=num; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		sc.close();

	}

}
