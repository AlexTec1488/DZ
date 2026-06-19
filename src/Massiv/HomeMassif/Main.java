package Massiv.HomeMassif;
import java.util.Random;

public class Main {
    public static final int SIZE = 8;
    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < colors.length; i++) {
           for (int j = 0; j < colors[i].length; j++) {
               colors[i][j] = random.nextInt(256);
           }
        }
        printColors(colors);
        int[][] result = rotateColors(colors);
        printColors(result);
    }
    public static int[][] rotateColors(int[][] colors) {
        int size = colors.length;
        int[][] result = new int[size][size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[size - 1 - j][i] = colors[i][j];
            }
        }
        return result;
    }
    public static void printColors(int[][] colors) {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.printf("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
}
