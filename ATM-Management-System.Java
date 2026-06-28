import java.util.Scanner;

public class ATMManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        if (atm.login(pin)) {

            while (true) {

                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter Amount to Deposit: ");
                        double deposit = sc.nextDouble();
                        atm.deposit(deposit);
                        break;

                    case 3:
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdraw = sc.nextDouble();
                        atm.withdraw(withdraw);
                        break;

                    case 4:
                        System.out.println("Thank You for Using ATM!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } else {
            System.out.println("Incorrect PIN!");
        }
    }
}
