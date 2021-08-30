package lambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
// //home//leo666//eclipse-workspace//cursoJavaUdemy//src//lambda//Employee.csv
public class Streams {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		var sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println("Enter salary: ");
			Double salary = sc.nextDouble();

			List<String> emaiList = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted()
					.collect(Collectors.toList());

			emaiList.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();

	}
}
