import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Main {
    static int accountBalance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice, inputAmount;

        do{
            System.out.println("________________________________");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdrawal Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("________________________________");
            System.out.println("Enter your preferred option ...");

            userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice){
                case 1:
                    System.out.println("Enter the amount to be deposited in Rs.");

                    inputAmount = Integer.parseInt(scanner.nextLine());
                    depositAmout(inputAmount);
                    break;

                case 2:
                    System.out.println("Enter the amount to be withdrawn in Rs.");

                    inputAmount = Integer.parseInt(scanner.nextLine());
                    withDrawAmount(inputAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    exit(0);

                default:
                    System.out.println("________________________________");
                    System.out.println("Invalid option, Please enter a valid option.");
            }
        }while(true);
    }

    static void checkBalance() {
        System.out.println("________________________________");
        System.out.println("Your balance is : " + accountBalance);
    }

    static void withDrawAmount(int inputAmount) {
        accountBalance -= inputAmount;
        checkBalance();
    }

    static void depositAmout(int inputAmount) {
        accountBalance += inputAmount;
        checkBalance();
    }
}
