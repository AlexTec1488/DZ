package Collection.HashSet_And_HashMap.HashMap;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sasha", 25);
        map.put("Kirill", 23);
        map.put("Olya", 26);
        //int age = map.get("Sasha");

        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " - " + value);
        }

        for (Map.Entry<String, Integer> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " = " + kv.getValue());
        }
    }
}
