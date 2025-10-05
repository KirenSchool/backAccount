public class BankAccount
{
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;

    public BankAccount(String name, int accountNum, double balance, String password)
    {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        this.password = password;
        this.loggedIn = false;
    }

    public boolean logIn(String name, String password)
    {
        if (this.name.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
        
        return loggedIn;
    }
    
    public void logOut()
    {
        loggedIn = false;
    }
    
    public double getBalance()
    {
        if (loggedIn)
        {
            return balance;
        }
        
        throw new IllegalStateException("You Are Logged Out :(");
    }
    
    public void deposite(double amount)
    {
        if (!loggedIn)
        {
            throw new IllegalStateException("You have to log in.");
        }
        if (amount <= 0)
        {
            throw new IllegalStateException("Try withdrawing instead buddy.");
        }
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        if (!loggedIn)
        {
            throw new IllegalStateException("You have to log in.");
        }
        if (amount <= 0)
        {
            throw new IllegalStateException("Try depositing instead buddy.");
        }
        if (amount > balance)
        {
            throw new IllegalStateException("You do not have that much buddy boy.");
        }
        
        balance -= amount;
    }
    public String toString()
    {
        return "Bank Account Information: \n" + "Name: " + name + "\n" + "Account Number: " + accountNum + "\n" + "Balance: " + (loggedIn ? "$" + balance : "[Must Log In First]") + "\n" + "Logged In: " + loggedIn;
    }
}