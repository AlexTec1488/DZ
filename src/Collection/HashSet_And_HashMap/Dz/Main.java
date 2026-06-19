package Collection.HashSet_And_HashMap.Dz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Address, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(new Address("Россия", "Москва"), 100);
        costPerAddress.put(new Address("Россия", "Казань"), 110);
        costPerAddress.put(new Address("Россия", "Воронеж"), 120);
        costPerAddress.put(new Address("Беларусь", "Гомель"), 130);
        costPerAddress.put(new Address("Армения", "Ереван"), 150);

        int total = 0;
        Set<String> countries = new HashSet<>();
        while (true) {
            System.out.println("Заполнение нового заказа");
            System.out.print("Введите страну: ");
            String country = sc.nextLine();
            if (country.equals("end")) {
                break;
            }
            System.out.print("Введите город: ");
            String city = sc.nextLine();
            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(sc.nextLine());

            Address address = new Address(country, city);
            if (costPerAddress.containsKey(address)) {
                int currentPrice = weight * costPerAddress.get(address);
                total += currentPrice;
                countries.add(country);

                System.out.printf("Стоимость доставки составит: %d руб.\n", currentPrice);
                System.out.printf("Общая стоимость всех доставок: %d руб.\n", total);
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
        }
    }
}
