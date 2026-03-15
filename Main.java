import java.util.Scanner;

/**
 * Main class that runs the Simple Banking System application.
 * 
 * This program allows a user to:
 * 1. Create a bank account
 * 2. Deposit money
 * 3. Withdraw money
 * 4. Check account balance
 * 5. View account details
 * 
 * The program uses a menu-driven approach to interact with the user.
 */
public class Main
{
    /**
     * The entry point of the program.
     * 
     * It creates a BankAccount object, collects account details
     * from the user, and displays a menu to perform banking operations.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.println("Create New Account");
        System.out.printf("\n");

        System.out.println("Enter your name");
        account.accountHolderName = sc.next();

        System.out.printf("\n");

        System.out.println("Enter your Account Number");
        account.accountNumber = sc.nextInt();

        System.out.printf("\n");

        System.out.println("Enter the initial balance");
        account.balance = sc.nextDouble();

        System.out.printf("\n");

        int choice;

        do 
        {
            System.out.println("\n==== Bank Menu ====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Check other Details");
            System.out.println("5. Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Deposit Amount");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter the Withdrawal Amount");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    account.checkDetails();
                    break;

                case 5:
                    System.out.println("Thanks for using Banking System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } 
        while(choice != 5);

    }
}


/**
 * Represents a simple bank account.
 * 
 * This class stores account information such as:
 * - Account holder name
 * - Account number
 * - Current balance
 * 
 * It also provides methods to deposit money, withdraw money,
 * check balance, and display account details.
 */
class BankAccount
{

    /** Name of the account holder */
    String accountHolderName;

    /** Unique account number of the user */
    int accountNumber;

    /** Current balance in the account */
    double balance;

    /**
     * Displays the account holder details including
     * name, account number, and current balance.
     */
    void checkDetails()
    {
        System.out.printf("Account Holder : %s\n", accountHolderName);
        System.out.printf("Account Number : %d\n", accountNumber);
        System.out.printf("Balance : %.2f₹\n", balance);
        System.out.printf("\n");
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to be deposited
     */
    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposit successful");
        System.out.printf("Balance: %.2f₹\n", balance);
        System.out.printf("\n");
    }

    /**
     * Withdraws money from the bank account.
     * 
     * If the withdrawal amount is greater than the
     * available balance, the transaction is denied.
     *
     * @param amount the amount to withdraw
     */
    void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
            System.out.printf("\n");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.printf("Balance : %.2f₹\n", balance);
            System.out.printf("\n");
        }
    }

    /**
     * Displays the current balance of the account.
     */
    void checkBalance()
    {
        System.out.printf("Your Balance is : %.2f₹\n", balance);
        System.out.printf("\n");
    }
}