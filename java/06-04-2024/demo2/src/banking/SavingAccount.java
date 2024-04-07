package banking;

final class SavingAccount extends Account implements Profitable {
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

    public double interest(int months){
        double rate = balance < 5 * MIN_BAL ? 0.3 : 0.4;
        return (balance * months * rate) / 1200;
    }
}
