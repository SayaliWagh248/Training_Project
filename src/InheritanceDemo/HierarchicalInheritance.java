package InheritanceDemo;
abstract class AccountOperationParent
{
    public double balance;

    public AccountOperationParent(double bal)
    {
        System.out.println("Setting data under super class");
        balance=bal;
    }

    abstract public double withdraw(double amount);
    abstract public double deposit(double amount);
}

class SavingChildAccount extends AccountOperationParent
{

    public SavingChildAccount(double bal) {
        super(bal);
        System.out.println("Inside Sub class's Constructor");
    }

    @Override
    public double withdraw(double amount)
    {
     balance=balance-amount;
        return balance;
    }

    @Override
    public double deposit(double amount)
    {
        balance=balance+amount;
        return balance;
    }
}

class CurrentChildAccount extends AccountOperationParent
{

    public CurrentChildAccount(double bal) {
        super(bal);
        System.out.println("Inside Sub class's Constructor");
    }

    @Override
    public double withdraw(double amount)
    {
        balance=balance-amount;
        return balance;
    }

    @Override
    public double deposit(double amount)
    {
        balance=balance+amount;
        return balance;
    }
}


public class HierarchicalInheritance

{
    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AccountOperationParent sca=new SavingChildAccount(5000000);    //up casting

        System.out.println();

        AccountOperationParent cca=new CurrentChildAccount(1000000);    //up casting

        System.out.println();

        System.out.println("Deposit operation executed on saving account, new balance is: "+sca.deposit(23000));
        System.out.println("Withdraw operation executed on saving account, new balance is: "+sca.withdraw(3000));

        System.out.println();

        System.out.println("Deposit operation executed on current account, new balance is: "+cca.deposit(23000));
        System.out.println("Withdraw operation executed on current account, new balance is: "+cca.withdraw(3000));
    }
}
