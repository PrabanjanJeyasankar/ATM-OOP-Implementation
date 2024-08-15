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
    public void initialize() throws InvalidAmountException, InsufficientBalanceException{
        Scanner scanner = new Scanner(System.in);
        int userChoice, inputAmount;

        do{
            System.out.println("________________________________");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdrawal Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("________________________________");
            System.out.print("Enter your preferred option - ");

            userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Enter the amount to be deposited in Rs.");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    if(inputAmount <= 0){
                        throw new InvalidAmountException("Amount must be greater than 0.");
                    }
                    depositAmount(inputAmount);
                }
                case 2 -> {
                    System.out.println("Enter the amount to be withdrawn in Rs.");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    if(inputAmount <= 0){
                        throw new InvalidAmountException("Amount must be greater than 0.");
                    }
                    if(getAccountBalance() < inputAmount){
                        throw new InsufficientBalanceException("Insufficient account balance.");
                    }
                    withDrawAmount(inputAmount);
                }
                case 3 -> checkBalance();
                case 4 -> {
                    System.out.println("Thank you, Have a nice day...");
                    exit(0);
                }
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
    public static void main(String[] args) throws InvalidAmountException, InsufficientBalanceException{
        StateBankOfIndia poonamalleeATM = new StateBankOfIndia();
        poonamalleeATM.initialize();
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }

}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }

}