package Massiv.DZ;
import java.util.Scanner;

public class ПробноеДействие {
    public static void main(String[] args) {
        String[] products = { "Молоко", "Мясо", "Рис" };
        int[] price = { 100, 300, 120};
        int[] counters = new int[products.length];
        showAssortment(products, price);
        doDialogCustomer(counters);
        showCart(products, price ,counters);
    }

    private static void showCart(String[] products, int[] price, int[] counters) {
        System.out.println("Ваша корзина");
        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (counters[i] > 0) {
                int currentPrice = price[i] * counters[i];
                totalPrice += currentPrice;
                System.out.printf("%s %d шт %d руб/шт %d руб в сумме\n",
                        products[i],
                        counters[i],
                        price[i],
                        currentPrice
                );
            }
        }
        System.out.println("Итого " + totalPrice + " руб");
    }

    private static void doDialogCustomer(int[] counters) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите товар и количество или введите 'end'");
            String input = sc.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");
            int position = Integer.parseInt(parts[0]) - 1;
            int quantity = Integer.parseInt(parts[1]);
            counters[position] += quantity;
        }
    }

    private static void showAssortment(String[] products, int[] price) {
        System.out.println("Введите товар и количество или end");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n",
                    i + 1,
                    products[i],
                    price[i]);
        }
    }
}
