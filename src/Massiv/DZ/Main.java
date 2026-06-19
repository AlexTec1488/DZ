package Massiv.DZ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] temps = new int[30];
        boolean[] isFilled = new boolean[30];
        while (true) {
            System.out.print("Введи два числа: дату или температуру ");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            temps[day] = t;
            isFilled[day] = true;

            int sum = 0;
            for (int tt : temps) {
                sum += tt;
            }
            int cnt = 0;
            for (boolean f : isFilled){
                if (f) {
                    cnt++;
                }
            }
            System.out.println(sum / cnt);
        }
    }
}
