package myProgram.CulculatorMortgage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.print("Введи сумму кредита или 'end' чтобы закончить: ");
            String input = scanner.nextLine();
            if (input.equals("end") || input.equals("конец")) {
                System.out.println("Конец");
                break;
            }
            int sumCredit = Integer.parseInt(input);

            System.out.print("Введи ставку (в %): ");
            double rate = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите срок (в мес): ");
            int forty = Integer.parseInt(scanner.nextLine());

            double total = monthPay(sumCredit, rate, forty);
            System.out.println("Ежемесячный платеж " + total + "\n");
        }
    }
    public static double monthPay(double sumCredit, double rate, double forty) {
        double monthRate = rate / 100 / 12;
        return sumCredit * monthRate * Math.pow(1 + monthRate, forty) / (Math.pow(1 + monthRate, forty) - 1);
    }
}
