package banking;

public abstract class Account {

    long id;
    protected double balance;

    public long id(){
        return id;
    }

    public double balance(){
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public final void transfer(double amount, Account cus) throws InsufficientBalanceException{
        if(this == cus){
            throw new IllegalTransferException();
        }
        this.withdraw(amount);
        cus.deposit(amount);
    }   
}
