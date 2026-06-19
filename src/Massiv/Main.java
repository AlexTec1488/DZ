package Massiv;

import Work.Worker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] qe = new int[6];
        qe[0] = 1;
        qe[1] = 2;
        qe[2] = 3;
        qe[3] = 5;
        qe[4] = 6;
        qe[5] = 7;
        System.out.println(Arrays.toString(qe));



        int[] arr = { 1, 2, 3, 5, 6, 7 };

        System.out.println(Arrays.toString(arr));

        boolean t = Arrays.equals(qe, arr);
        System.out.println(t);

        Worker[] rab = new Worker[3];
        rab[0] = new Worker("sasha", "tec", 41, 5.6);
        rab[1] = new Worker("Stas", "Asafev", 34, 3);
        rab[2] = new Worker("Andrey", "Voronov", 23, 1);
        System.out.println(Arrays.toString(rab));
        System.out.println();



        Taxi[] w2 = {
                new Taxi("Alex", 25, 5),
                new Taxi("Geo", 24 , 4.6),
                new Taxi("Kat", 20, 3)
        };

        System.out.println(Arrays.toString(w2));

        for (Taxi taxi : w2) {
            System.out.println(taxi.toString());
        }
    }
}
