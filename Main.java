import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        String accNo = sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        System.out.println("Enter Interest Rate:");
        double rate = sc.nextDouble();

        SavingsAccount account = new SavingsAccount(accNo, name, bal, rate);

        int choice;

        do {
            System.out.println("\n======== MENU ========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter amount to deposit:");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    System.out.println("\nUpdated Account Details:");
                    account.display();
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    System.out.println("\nUpdated Account Details:");
                    account.display();
                    break;

                case 3:
                    account.addInterest();
                    System.out.println("\nUpdated Account Details:");
                    account.display();
                    break;

                case 4:
                    account.display();
                    break;

                case 5:
                    System.out.println("Thank you for using our Bank!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
