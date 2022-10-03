package application;

import entities.Client;

public class Aula241HashEqualsPersonalizado {

	public static void main(String[] args) {
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));// comparar conteudos dos objetos
		System.out.println(c1 == c2); // comparar referencia dos objetos
		

	}

}
