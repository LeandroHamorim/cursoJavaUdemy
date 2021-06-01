import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        boolean ok;
        var account = new Account();
        do {
            try {
                System.out.println("Enter account data");
                System.out.println("Number: ");
                int number = sc.nextInt();
                System.out.println("Holder: ");
                sc.next();
                String holder = sc.next();
                System.out.println("Initial balance: ");
                double balance = sc.nextDouble();
                System.out.println("Withdraw limit: ");
                double withdrawLimit = sc.nextDouble();
                account.setNumber(number);
                account.setHolder(holder);
                account.deposit(balance);
                account.setWithdrawLimit(withdrawLimit);
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Try again");
                ok = false;
            }
        } while (ok != true);

        try {
            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (WithdrawException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
