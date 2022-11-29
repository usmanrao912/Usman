package bankmanagement;
public class SavingAccount extends BankManagement
{

    private double balance;

    public SavingAccount(String name, String address, String accountNumber, double balance)
    {
        super(name, address, accountNumber);
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    @Override
    public String toString()
    {
        return "SavingsAccount [balance=" + balance + ", toString()=" + super.toString() + "]";
    }

}