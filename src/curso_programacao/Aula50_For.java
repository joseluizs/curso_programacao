package curso_programacao;

import java.util.Scanner;

public class Aula50_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i=4; i>0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		//----------Teste de Mesa---------------//
		int a = 3;
		int b = 0;
		
		for(int i=0; i<a; i++) {
			System.out.print(i + ",");
			b = b + 5;
			System.out.println(b);
		}
		
		
		sc.close();

	}

}
