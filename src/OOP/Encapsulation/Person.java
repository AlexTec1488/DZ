package OOP.Encapsulation;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setAge(int age) {
        if (age < 0 || age > 130)
            return;
        this.age = age;
    }
    public void  happyBirthday() {
        age++;
        System.out.println("С др!");

    }

    public int getAge() {
        return age;
    }

    public boolean isToYoung() {
        return age > 18;
    }
}
