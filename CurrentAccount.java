package bankmanagement;
public class CurrentAccount extends BankManagement{
    public double overdraftLimit;

    public CurrentAccount(String name, String address, String accountNumber, double overdraftLimit)
    {
        super(name, address, accountNumber);
        this.overdraftLimit = overdraftLimit;
     }

    public double getOverdraftLimit()
    {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit)
    {
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount)
    {
        overdraftLimit = overdraftLimit + amount;
     }

    public void withdraw(double amount)
    {
        overdraftLimit = overdraftLimit - amount;
    }

    @Override
    public String toString()
    {
        return "CurrentAccount [overdraftLimit=" + overdraftLimit + ", toString()=" + super.toString() + "]";
    }

}
