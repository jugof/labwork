package banking;

public class Banker {
    
    private static long nid = System.currentTimeMillis();

    public static Account createCurrentAccount(){
        var acc = new CurrentAccount();
        acc.id = ++nid;
        return acc;
    }

    public static Account createSavingAccount(){
        var acc = new SavingAccount();
        acc.id = ++nid;
        return acc;
    }
}
