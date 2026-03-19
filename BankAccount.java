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


public class BankAccount
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