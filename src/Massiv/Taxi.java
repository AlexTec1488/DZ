package Massiv;

public class Taxi {
    public static double maxRating = 0;

    public String name;
    public int age;
    public double rating;

    public Taxi(String name, int age, double rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
        maxRating = Math.max(maxRating, rating);
    }

    public Taxi(String name, int age) {
        this(name, age, 4.5);
    }


    public void tell(String verse) {
        System.out.println("Я " + name + ", говорю тебе: " + verse);

    }
    public boolean isTooYoung() {
        if (age > 21 && rating > 4.5) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "[" + rating + "] " + name + " (" + age + " лет)";
    }
}
