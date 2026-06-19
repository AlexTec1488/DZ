package OOP.Polymorphism.DzPolimorphism.taxes;

public class UsnIncomeMinusExpensesTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int inCome = debit - credit;
        int tax = inCome * 15 / 100;
        return Math.max(tax, 0);
    }
}
