package curso_programacao;

import java.util.Scanner;

public class ExercAula37_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		double total;
		if(cod == 1) {
			total = qtd * 4.0;
		}else if(cod == 2) {
			total = qtd * 4.5;
		}else if(cod == 3) {
			total = qtd * 5.0;
		}else if(cod == 41) {
			total = qtd * 2.0;
		}else{
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n ", total);
		
		sc.close();

	}

}
