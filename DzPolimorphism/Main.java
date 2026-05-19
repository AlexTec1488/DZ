package DzPolimorphism;

import DzPolimorphism.taxes.TaxSystem;
import DzPolimorphism.taxes.UsnIncomeMinusExpensesTaxSystem;
import DzPolimorphism.taxes.UsnIncomeTaxSystem;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(
                "Apple",
                new TaxSystem()
        );
        company1.shiftMoney(100);
        company1.shiftMoney(50);
        company1.payTaxes();

        Company company2 = new Company(
                "Сбер",
                new UsnIncomeTaxSystem()
        );
        company2.shiftMoney(200);
        company2.shiftMoney(300);
        company2.payTaxes();

        Company company3 = new Company(
                "Т-банк",
                new UsnIncomeMinusExpensesTaxSystem()
        );
        company3.shiftMoney(500);
        company3.shiftMoney(-200);
        company3.payTaxes();
    }
}


