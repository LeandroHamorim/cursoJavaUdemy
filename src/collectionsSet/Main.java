package collectionsSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);
		Set<Integer> studentsCourseA = new HashSet<>();
		Set<Integer> studentsCourseB = new HashSet<>();
		Set<Integer> studentsCourseC = new HashSet<>();

		System.out.println("How many students for course A? ");
		int amountStudents = sc.nextInt();
		for (int i = 0; i < amountStudents; i++) {
			int studentNumber = sc.nextInt();
			studentsCourseA.add(studentNumber);
		}

		System.out.println("How many students for course B? ");
		amountStudents = sc.nextInt();
		for (int i = 0; i < amountStudents; i++) {
			int studentNumber = sc.nextInt();
			studentsCourseB.add(studentNumber);
		}
		
		final Stream <String> stream = getStream();

		System.out.println("How many students for course C? ");
		amountStudents = sc.nextInt();
		for (int i = 0; i < amountStudents; i++) {
			int studentNumber = sc.nextInt();
			studentsCourseC.add(studentNumber);
		}
		
		Set<Integer> total = new HashSet<>(studentsCourseA);
		total.addAll(studentsCourseB);
		total.addAll(studentsCourseC);

		System.out.println("Total students: " + total.size());
		

		sc.close();
	}

}
