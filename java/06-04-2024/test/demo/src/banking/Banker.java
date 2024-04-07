package banking;

public class Banker {
    
    private static long vid = System.currentTimeMillis();

    public static Account openSavingAccount(){
        var cust = new SavingsAccount();
        cust.id = ++vid;
        return cust;
    }

    public static Account openCurrentAccount(){
        var cust = new CurrentAccount();
        cust.id = ++vid;
        return cust;
    }

}
