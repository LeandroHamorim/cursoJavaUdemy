package AbstractMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        System.out.println("Enter the number of tax payers: ");
        var n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Tax payer #%d data: ", i);
            System.out.println("/n Individual or company (i/c) ?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            var name = sc.next();
            System.out.println("Annual Income:");
            var annualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                var healthExpenditures = sc.nextDouble();
                Person person = new NaturalPerson(name, annualIncome, healthExpenditures);
                personList.add(person);
            } else if (ch == 'c') {
                System.out.println("number of employees: ");
                var numberOfEmployees = sc.nextInt();
                Person person = new LegalPerson(name, annualIncome, numberOfEmployees);
                personList.add(person);
            }

        }
        sc.close();
        System.out.println("Taxes paid: ");
        for (Person x : personList) {
            System.out.println(x.name + " $ " + x.tax());
        }
    }
}
