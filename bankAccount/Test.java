public class Test
{
    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount("Kiren", 67, 525600.0, "password678");
        System.out.println("Bank Account Made");
        
        boolean loggedIn = myAccount.logIn("Kiren", "wrongPassword123");
        System.out.println("Did it work? Answer: " + loggedIn);
        loggedIn = myAccount.logIn("Kiren", "password678");
        System.out.println("Did it work? Answer: " + loggedIn);
        
        System.out.println("Current Money Is: " + myAccount.getBalance());
        myAccount.deposite(78.0);
        System.out.println("Deposited some money. New balance is: " + myAccount.getBalance());
        myAccount.withdraw(78.0);
        System.out.println("Withdrew some money. New balance is: " + myAccount.getBalance());
    }
}