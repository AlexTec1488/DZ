package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Singer singer = new Singer("Alex", 15, 3);//new Person("Alex", 15);

       if (checkPerson(singer)) {

       }


        /*person.setAge(23);
        System.out.println(person.setAge());
        System.out.println(person.isToYoung());
        person.happyBirthday();

        Singer singer = new Singer("Ilya", 25, 3);
        singer.happyBirthday("привет");
        singer.sing(" доброе утро");
        System.out.println(singer.toString());
*/


    }
    public static boolean checkPerson(Person person){
        return person.getAge() <= 18;
    }
}
