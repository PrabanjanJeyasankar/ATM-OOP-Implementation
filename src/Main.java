import java.util.Scanner;

import static java.lang.System.exit;

class ATM{
    private int accountBalance;

    public int getAccountBalance(){
        return accountBalance;
    }
    public void addMoney(int amountToBeDeposited){
        accountBalance += amountToBeDeposited;
    }
    public void deductMoney(int amountToBeWithDrawn){
        accountBalance -= amountToBeWithDrawn;
    }
}

class StateBankOfIndia extends ATM{
    public void initialize(){
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

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Enter the amount to be deposited in Rs.");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    depositAmount(inputAmount);
                }
                case 2 -> {
                    System.out.println("Enter the amount to be withdrawn in Rs.");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    withDrawAmount(inputAmount);
                }
                case 3 -> checkBalance();
                case 4 -> exit(0);
                default -> {
                    System.out.println("________________________________");
                    System.out.println("Invalid option, Please enter a valid option.");
                }
            }
        }while(true);
    }
    private void checkBalance() {
        System.out.println("________________________________");
        System.out.println("Your balance is : " + getAccountBalance());
    }

    private void withDrawAmount(int inputAmount) {
        deductMoney(inputAmount);
        checkBalance();
    }

    private void depositAmount(int inputAmount) {
        addMoney(inputAmount);
        checkBalance();
    }
}
public class Main {
    public static void main(String[] args) {
        StateBankOfIndia poonamalleeATM = new StateBankOfIndia();
        poonamalleeATM.initialize();
    }


}
