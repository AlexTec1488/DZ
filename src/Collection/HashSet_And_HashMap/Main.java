package Collection.HashSet_And_HashMap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Sasha");


        String name1 = list.set(1, "Kirill");
        String name = list.get(0);


        MyMap<String, UserInfo> map = new MyMap<>();
        map.put("Petya", new UserInfo(20));
        map.put("Kirill", new UserInfo(23));
        UserInfo info = map.get("Petya");
        System.out.println(info);
    }
}
