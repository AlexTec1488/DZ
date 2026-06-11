package ArrayList.Dz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            printMenu();
            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 0:
                    System.out.println("Конец");
                    isContinue = false;
                    break;
                case 1:
                    addCase();
                    break;
                case 2:
                    break;
                case 3:
                    deleteByNumber();
                    break;
                case 4:
                    deleteByTitle();
                    break;
                default:
                    System.out.println("Ошибка");
            }
            showTasks();
        }
    }
    private static void deleteByTitle() {
        System.out.print("Введите задачу для удаления: ");
        String task = sc.nextLine();
        if (list.contains(task)) {
            list.remove(task);
            System.out.println("Удалено");
        }
    }
    private static void deleteByNumber() {
        System.out.print("Введите номер для удаления: ");
        int task = Integer.parseInt(sc.nextLine()) - 1;
        if (task >= 0 && task < list.size()) {
            list.remove(task);
            System.out.println("Удалено");
        } 
    }
    private static void showTasks() {
        System.out.println("Ваш список дел");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, list.get(i));
        }
        System.out.println();
    }
    private static void printMenu() {
        System.out.println("Выберете операцию:\n");
        System.out.print(
                        "0. Выход из программы\n" +
                        "1. Добавить дело\n" +
                        "2. Показать дела\n" +
                        "3. Удалить дело по номеру\n" +
                        "4. Удалить дело по названию\n" +
                        "Ваш выбор: "
        );
    }
    private static void addCase() {
        System.out.print("Введите название задачи: ");
        String task = sc.nextLine();
        list.add(task);
        System.out.println("Добавлено!");
    }
}
