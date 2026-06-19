package Massiv;

public class Main5 {
    public static void main(String[] args) {
       System.out.println("Макс рейтинг: " + Taxi.maxRating);


        Taxi taxi = new Taxi("Geo", 25);
        taxi.tell("Здорова! Куда едем?");
        System.out.println(taxi);
        System.out.println("Макс рейтинг: " + Taxi.maxRating);
        System.out.println(taxi.isTooYoung() + "\n");

        Taxi taxi2 = new Taxi("Sasha", 25, 5);
        taxi2.tell("Салам! Куда едем?");
        System.out.println(taxi2);
        System.out.println("Макс рейтинг: " + Taxi.maxRating);
        System.out.println(taxi2.isTooYoung());


    }
}
