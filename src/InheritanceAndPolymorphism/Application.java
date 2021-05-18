package InheritanceAndPolymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {

		var sdf = new SimpleDateFormat("dd/MM/yyyy");
		var sc = new Scanner(System.in);

		System.out.println("Enter the number of products: ");
		final var n = sc.nextInt();

		List<Product> products = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.println("Common, used or imported(c/u/i)?");
			char productType = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			if (productType == 'c') {
				products.add(new Product(name, price));
			} else if (productType == 'u') {
				System.out.println("Manufacturedate (DD/MM/YYYY): ");
				var manufactureDate = sdf.parse(sc.next());
				products.add(new UsedProduct(name, price, manufactureDate));
			} else {
				System.out.println("Customsfee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println(" \n PRICE TAGS:");
		for (Product y : products) {
			System.out.println(y.priceTag());
		}
		sc.close();
	}

}
