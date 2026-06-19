package OOP.Encapsulation;

public class Singer extends Person {
    public int rating;

    public Singer(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }

    public void sing (String verse) {
        System.out.println("Я " + name + " пою:" + verse);
    }

    public void happyBirthday(String verse1) {
        age++;
        System.out.println("У меня рейтинг " + rating + " и я пою тебе " + verse1);
    }

    @Override
    public String toString() {
        return "[" + rating + "] " + name + " (" + age + " лет)";
    }

}
