
class BankAccount
{

    String accountHolderName;
    int accountNumber;
    double balance;

    void checkDetails()
    {
        System.out.printf("Account Holder : %s\n", accountHolderName);
        System.out.printf("Account Number : %d\n", accountNumber);
        System.out.printf("Balance : %f\n", balance);
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposit successful");
        System.out.printf("Balance: %f\n", balance);
    }

    void withdraw(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.printf("Balance : %f\n", balance);
        }
    }

    void checkBalance()
    {
        System.out.printf("Your Balance is : %f\n", balance);
    }
}