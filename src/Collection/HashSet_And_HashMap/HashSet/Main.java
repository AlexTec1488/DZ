package Collection.HashSet_And_HashMap.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Petya ");
        set.add("Sasha");
        set.add("Sasha");
        System.out.println(set);
        System.out.println(set.contains("Sasha"));
    }
}
