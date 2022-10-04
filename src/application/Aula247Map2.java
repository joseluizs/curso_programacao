package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product1;

public class Aula247Map2 {

	public static void main(String[] args) {
		
		Map<Product1, Double> stock = new HashMap<>();
		
		Product1 p1 = new Product1("Tv", 900.0);
		Product1 p2 = new Product1("Notebook", 1200.0);
		Product1 p3 = new Product1("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product1 ps = new Product1("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
