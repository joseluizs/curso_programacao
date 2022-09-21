package application;

public class Aula97ForEach {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		
		System.out.println("------------ For Each ----------------");
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
