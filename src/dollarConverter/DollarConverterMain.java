package dollarConverter;

import java.util.Scanner;

public class DollarConverterMain {
	

	public static void main(String[] args) {
		double dollarPrice;
		double dollarBought;
		Scanner sc  = new Scanner(System.in);
		System.out.println("What is the dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		dollarBought = sc.nextDouble();
		sc.close();
		double result = DollarConverter.converter(dollarPrice,dollarBought);
		System.out.printf("Amount to be paid in reais = "+ result);
	}

}
