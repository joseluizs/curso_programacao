package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import model.services.USATaxService;

public class Aula226CompositionServices {

	public static void main(String[] args) throws ParseException{

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		CarRental cr1 = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour Brazil: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day Brazil: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		rentalService.processInvoice(cr);
		
		rentalService = new RentalService(pricePerDay, pricePerHour, new USATaxService());
		rentalService.processInvoice(cr1);
		
		System.out.print("Enter price per hour USA: ");
		pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day USA: ");
		pricePerDay = sc.nextDouble();
		
		
		
		

		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		System.out.println("----------------------USA------------------------------------------------");
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr1.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr1.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr1.getInvoice().getTotalPayment()));
		
		
		
		
		sc.close();

	}

}
