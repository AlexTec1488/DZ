package Collection.TreeMap_And_TreeSet.Comparable_And_Comparator;

import java.util.Comparator;

public class PersonNameLenghtComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.name.length(), o2.name.length());
    }
}
