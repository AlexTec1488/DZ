package MassifMain;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 3;
    public static final char EMPTY = '_';
    public static final char CROSS = 'x';
    public static final char ZERO = '0';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
        Scanner sc = new Scanner(System.in);
        boolean isCrossTurn = true;

        while (true) {
            System.out.println("Ходят " + (isCrossTurn ? "крестики!" : "нолики!"));
            printFiled(field);
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int o = Integer.parseInt(parts[1]) - 1;

            if (field[x][o] != EMPTY) {
                continue;
            }
            field[x][o] = isCrossTurn ? CROSS : ZERO;

            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                System.out.println("Выиграли " + (isCrossTurn ? "крестики!" : "нолики!"));
                printFiled(field);
                break;
            } else {
                if (isCrossTurn) {
                    isCrossTurn = false;
                } else {
                    isCrossTurn = true;
                }
               // isCrossTurn = !isCrossTurn;
            }
        }
    }
    public static boolean isWin(char[][] field, char playser) {
        if (field[0][0] == playser && field[0][1] == playser && field[0][2] == playser)
            return true;
        if (field[1][0] == playser && field[1][1] == playser && field[1][2] == playser)
            return true;
        if (field[2][0] == playser && field[2][1] == playser && field[2][2] == playser)
            return true;

        if (field[0][0] == playser && field[1][0] == playser && field[2][0] == playser)
            return true;
        if (field[0][1] == playser && field[1][1] == playser && field[2][1] == playser)
            return true;
        if (field[0][2] == playser && field[1][2] == playser && field[2][2] == playser)
            return true;

        if (field[0][0] == playser && field[1][1] == playser && field[2][2] == playser)
            return true;
        if (field[0][2] == playser && field[1][1] == playser && field[2][0] == playser)
            return true;

        return false;
    }

    public static void printFiled(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
