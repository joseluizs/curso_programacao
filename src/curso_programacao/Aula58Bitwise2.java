package curso_programacao;

import java.util.Scanner;

public class Aula58Bitwise2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = read.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		
		read.close();
	}

}
