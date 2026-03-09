
import java.util.Scanner;

public class Main
{
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


class BankAccount
{

    String accountHolderName;
    int accountNumber;
    double balance;

    void checkDetails()
    {
        System.out.printf("Account Holder : %s\n", accountHolderName);
        System.out.printf("Account Number : %d\n", accountNumber);
        System.out.printf("Balance : %.2f₹\n", balance);
        System.out.printf("\n");
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposit successful");
        System.out.printf("Balance: %.2f₹\n", balance);
        System.out.printf("\n");
    }

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

    void checkBalance()
    {
        System.out.printf("Your Balance is : %.2f₹\n", balance);
        System.out.printf("\n");
    }
}

