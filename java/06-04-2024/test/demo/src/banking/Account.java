package banking;

public abstract class Account {
    long id;
    protected double balance;
    
    public long getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundException;

    public final void transfer(double amount, Account cus) throws InsufficientFundException{

        if(this.id == cus.id){
            throw new IllegalTransferException();
        }
        this.withdraw(amount);
        cus.deposit(amount);
    }
}
