package Work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Открой карточку сотрудника: ");
            Worker worker1 = new Worker("Alex", "Shchegolev", 25, 4.2);
            Worker worker2 = new Worker("Kirill", "Sergeev", 23, 3.6);
            Worker worker3 = new Worker("Pavel", "Grishko", 34, 6.7);
            String cart = sc.next();
            switch (cart) {
                case "грузчик":
                    System.out.println(worker1);
                    break;
                case "слесарь":
                    System.out.println(worker2);
                    break;
                case "электрик":
                    System.out.println(worker3);
                    break;
                default:
                    System.out.println("ошибка");

            }
        }
    }
}
