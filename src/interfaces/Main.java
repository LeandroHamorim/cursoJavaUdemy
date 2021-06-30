package interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final var sc = new Scanner(System.in);
		final var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		var number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		String contractDate = sc.nextLine();

		LocalDate date = LocalDate.parse(contractDate, formatter);
		System.out.print("Contract value: ");
		var amount = sc.nextDouble();
		
		var contract = new Contract(number, date, amount);
		
		System.out.print("Enter number of installments: ");
		var months = sc.nextInt();
		var processContract = new ProcessContractService(new PaypalService());
		
		System.out.println("Installments:");
		processContract.ProcessInstallments(contract, months);
		List<Installment> installments = new ArrayList<>();
		installments = contract.getInstallments();
		
		for(Installment x: installments) {
			System.out.println(x.getDueDate().format(formatter)+ " - " + x.getAmount());
		}
	
		sc.close();

	}

}
