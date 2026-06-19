package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sasha");  // add - это метод который, присваивает значение в Collection.ArrayList //
        list.add("Shchegolev");
        list.add("Olegovich");
        System.out.println(list);
        System.out.println(list.size()); // size - это метод который, показывает число сколько всего значений действует по принципу массива //
        list.set(0, "Anna");   // set - это метод, в который можно положить какое-то значение в ячейку в место другого например ( set(2, "   " ) //
        System.out.println(list);
        System.out.println(list.get(2));  // get - это метод который, показывает присвоенное значение за счёт индекса //
        list.add(1,"Pasha");
        System.out.println(list);
        System.out.println(list.contains("Sasha"));  // contains - это метод который, спрашивает. Содержит ли какое-то значение отвечает true or false //

 /*       for (int i = 0; i < Collection.ArrayList.list.size(); i++ ) {
            System.out.println(Collection.ArrayList.list.get(i));
        }

        for (String ss : Collection.ArrayList.list) {
            System.out.println(ss);
        }
*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
