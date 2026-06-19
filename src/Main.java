import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spending = 0;
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.print("Введите сумму дохода: ");
                    int money = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    earnings += money;
                    break;
                case 2:
                    System.out.print("Введите сумму расхода: ");
                    int experense = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                    spending += experense;
                    break;
                case 3:
                    int totle1 = taxEarningMinusSpendings(earnings, spending);
                    int totle2 = taxEarning(earnings);
                    int result = totle2 - totle1;
                    int result1 = totle1 - totle2;
                    System.out.println();
                    if (totle1 < totle2) {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + totle1);
                        System.out.println("Налог по другой системе: " + totle2);
                        System.out.println("Экономия: " + result);
                    } else if (totle1 > totle2) {
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Ваш налог составит: " + totle2);
                        System.out.println("Налог по другой системе: " + totle1);
                        System.out.println("Экономия: " + result1);
                    } else {
                        System.out.println("Мы можете выбрать любую систему");
                        System.out.println("Налог по системе доходы минус расходы составит: " + totle1);
                        System.out.println("Налог по системе доходы составит: " + totle2);
                        System.out.println("Экономия: " + result);
                    }
                    System.out.println();
                    break;
            }
        }
        System.out.println();
        System.out.println("Программа завершена!");
    }
    public static int taxEarningMinusSpendings (int earnings, int spending) {
        int tax1 = (earnings - spending) * 15 / 100;
        if (tax1 >= 0) {
            return tax1;
        } else {
            return 0;
        }
    }
    public static int taxEarning(int earnings) {
        int tax2 = earnings * 6 / 100;
        if (tax2 >= 0) {
            return tax2;
        } else {
            return 0;
        }
    }
}
