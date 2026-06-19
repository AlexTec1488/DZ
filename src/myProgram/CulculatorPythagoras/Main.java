package myProgram.CulculatorPythagoras;

import java.util.Scanner;

public class Main {
    public static double resalt(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи через пробел первый и второй катет: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        System.out.println("Гипотенуза равна: " + resalt(a, b));


    }
}
