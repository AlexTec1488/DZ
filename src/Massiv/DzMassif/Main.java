package Massiv.DzMassif;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] temp = new int[12][31];
        boolean[][] isTooYung = new boolean[12][31];
        scan(temp, isTooYung);
        calculation(temp, isTooYung);
    }
    public static void scan(int[][] temp, boolean[][] isTooYung) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введи день, месяц и температуру через пробел или end: ");
            String input = sc.nextLine();
            if ("end".equals(input)){
                break;
            }
            String[] parts = input.split(" ");
            int month = Integer.parseInt(parts[0]) - 1;
            int day = Integer.parseInt(parts[1]) - 1;
            int temperature = Integer.parseInt(parts[2]);
            temp[month][day] = temperature;
            isTooYung[month][day] = true;
        }
    }
    public static void calculation(int[][] temp, boolean[][] isTooYung) {
        int sum = 0;
        int crt = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (isTooYung[i][j]) {
                    sum += temp[i][j];
                    crt++;
                }
            }
        }
        System.out.println("Средняя температура: " + sum / crt);
    }
}
