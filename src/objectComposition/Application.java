package objectComposition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		var sc = new Scanner(System.in);
		var sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter Client data: \n");
		System.out.println("Name: ");
		var name = sc.nextLine();
		System.out.println("Email: ");
		var email = sc.nextLine();
		System.out.println("Birth date dd/mm/yyyy: ");
		var birthDate = sdf.parse(sc.next());
		var client = new Client (name, email, birthDate);
		
		
		System.out.println("Enter order data: ");
		System.out.println("Status: \n PENDING_PAYMENT, PROCESSING, SHIPPED OR DELIVERED???");
		sc.nextLine();
		var status = sc.nextLine(); 
		var os = OrderStatusEnum.valueOf(status);
		var order = new Order(new Date(),os, client);
		
		System.out.println("How many items to this order?");
		final var n = sc.nextInt();
		for (int i =1; i <= n; i++) {
			System.out.println("Enter #"+i);
			sc.nextLine();
			System.out.print("Product name: ");
			var pName = sc.nextLine();
			System.out.print("Product price: ");
			var pPrice = sc.nextDouble();
			var product = new Product(pName, pPrice);
			
			System.out.print("Quantity: ");
			var pQuantity = sc.nextInt();
			
			var orderItem = new OrderItem(product, pQuantity, pPrice);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("Order Summary: \n");
		System.out.println(order);
		
		sc.close();

	}

}
