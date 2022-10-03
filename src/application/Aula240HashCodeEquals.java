package application;

public class Aula240HashCodeEquals {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
