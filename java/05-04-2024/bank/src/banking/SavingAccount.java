package banking;

final class SavingAccount extends Account {
    static final double MIN_BAL = 1500;
    SavingAccount() {
        balance = MIN_BAL;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(balance-amount < MIN_BAL){
            throw new InsufficientBalanceException();
        }
        balance -= amount;
    }
}
