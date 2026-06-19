package OOP.Polymorphism.DzPolimorphism;

import OOP.Polymorphism.DzPolimorphism.taxes.TaxSystem;

public class Company {
    private final String title;
    private int debit;
    private int credit;
    private final TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            this.debit += amount;
        }
        if (amount < 0){
            this.credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxSystem.calcTaxFor(debit, credit) + " руб.");
        debit = credit = 0;
    }
}
