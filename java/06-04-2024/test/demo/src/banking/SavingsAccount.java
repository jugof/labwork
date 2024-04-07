

final public class SavingsAccount extends Account implements Profitable {

    final static double MIN_BAL = 2000;

    SavingsAccount() {
        balance = MIN_BAL;    
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance-amount < MIN_BAL){
            throw new InsufficientFundException();
        }
        balance -= amount;
    }

    public double interest(int months){
        double rate = balance < 5 * MIN_BAL ? 0.3 : 0.4;

        return balance * rate * months / 1200;
    }
}
