/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre
 * a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar 
 * a mensagem "divisao impossivel"*/

package curso_programacao;

import java.util.Scanner;

public class ExercAula50_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y==0) {
				System.out.println("Não pode ser dividido! ");
			}else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();

	}

}
