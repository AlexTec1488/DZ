package Collection.TreeMap_And_TreeSet.Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sasha", 23));
        people.add(new Person("Oleg", 25));
        people.add(new Person("Kirill", 23));
        people.add(new Person("Anna", 23));
        System.out.println(people);

        Collections.sort(people, new PersonNameLenghtComparator());
        System.out.println(people);


    }
}
