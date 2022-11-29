package bankmanagement;
public class BankManagement {
    private String name;
    private String address;
    private String accountNumber;
    
    public BankManagement(String name, String address, String accountNumber)
    {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString()
    {
        return "Bank [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber + "]";
    }

    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount("Usman", "Islamabad", "12345", 1000.00);
        CurrentAccount currentAccount = new CurrentAccount("Rao", "Sargodha", "56789", 2000.00);
        
        System.out.println(savingsAccount.toString());
        System.out.println(currentAccount.toString());

        savingsAccount.deposit(500.00);
        currentAccount.withdraw(500.00);

        System.out.println(savingsAccount.toString());
        System.out.println(currentAccount.toString());

}

}
