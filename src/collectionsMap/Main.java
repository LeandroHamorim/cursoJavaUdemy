package collectionsMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		Map<String, Integer> totalVotes = new HashMap<>();

		System.out.println("Enter file full path: ");
		String filePath = sc.nextLine();

		try (var br = new BufferedReader(new FileReader(filePath))) {

			String csvLine = br.readLine();
			while (csvLine != null) {

				String[] fields = csvLine.split(",");
				if (!totalVotes.containsKey(fields[0])) {
					totalVotes.put(fields[0], Integer.valueOf(fields[1]));
				} else {
					totalVotes.put(fields[0], totalVotes.get(fields[0]) + Integer.valueOf(fields[1]));
				}
				csvLine = br.readLine();
			}

			sc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(totalVotes);
	}

}
