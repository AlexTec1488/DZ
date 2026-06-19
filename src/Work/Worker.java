package Work;

public class Worker {
    public String name;
    public String lastName;
    public int age;
    public double workExperience;

    public Worker(String name, String lastName, int age, double workExperience) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Кандидат: " + name + " " + lastName + "\nВозраст: " + age + " лет" + "\nСтаж работы: " + workExperience + "\n\n";
    }
    public void tel(String versio) {
        System.out.println("цитата\n" );
    }

    public boolean isTooYoung1() {
        return age <= 40 || workExperience >= 3;
    }
    public void setAge(int age) {
        if (age < 18 || age > 150)
            return;
        this.age = age;
    }
    public int setAge() {
        return age;
    }
}
