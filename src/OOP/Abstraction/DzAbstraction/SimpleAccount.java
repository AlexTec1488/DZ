package OOP.Abstraction.DzAbstraction;

public class SimpleAccount extends Account {
    public SimpleAccount() {
        super(1_000L);
    }

    @Override
    public boolean add(long amount) {
        this.balance += amount;
        return true;

    }

    @Override
    public boolean pay(long amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (this.add(amount) || this.pay(amount)) {
            return true;
        } else {
            return false;
        }

    }
}
