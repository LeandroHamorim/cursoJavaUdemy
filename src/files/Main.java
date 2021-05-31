package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		System.out.println("Enter the Source file path: ");
		String filePath = sc.nextLine();

		File sourceFile = new File(filePath);
		new File(sourceFile.getParent() + "//out").mkdir();
		String outputString = sourceFile.getParent() + "//out//summary.csv";

		try (var br = new BufferedReader(new FileReader(filePath))) {
			String csvLine = br.readLine();
			while (csvLine != null) {
				String[] fields = csvLine.split(",");
				var product = new Product();
				product.setName(fields[0]);
				product.setPrice(Double.valueOf(fields[1]));
				product.setQuantity(Integer.valueOf(fields[2]));
				productList.add(product);
				csvLine = br.readLine();
			}

			try (var bw = new BufferedWriter(new FileWriter(outputString))) {
				for (Product x : productList) {
					bw.write(x.getName() + "," + x.total());
					bw.newLine();
				}
				System.out.println("Summary.csv file created!");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
