package OOP.Abstraction.DzAbstraction;

public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount() {
        super(-1_444L);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (this.balance + amount > 0) {
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (this.balance -amount < creditLimit) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        return false;
    }
}
