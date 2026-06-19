package Collection.ArrayList.list;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        String s = "Hello " + "World";
        String a = s.replace('e','@');
        boolean d = s.contains("rld");
        boolean w = s.startsWith("Hell");
        //String y = s.indexOf("5");
        //System.out.println(w);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String ss = sb.toString();
        //System.out.println(sb);

        final int N = 1_00;

        System.out.println("Start");
        //String v = "";
        StringBuilder qq = new StringBuilder();
        for (int i = 0; i < N; i++){
            if (i % (N / 100) == 0);
            System.out.println((i / (N / 100)) + "%...");
            //v = v + '!';
            qq.append("Hell");
        }
        String n = qq.toString();
        System.out.println("Finish!");
        System.out.println("Generator string with " + qq.length() + " length");









        ArrayList list = new ArrayList();
        list.add("Anya");
        list.add("Petya");
        list.add("Olya");
        //System.out.println(Collection.ArrayList.list);

        ArrayList list2 = new ArrayList();
        list2.add("Anya, Sasha");
        list2.add("Petya");
        list2.add("Olya");
        ArrayList list3 = list2;


        /*System.out.println(list2);
        System.out.println(Collection.ArrayList.list);
        System.out.println(Collection.ArrayList.list.equals(Collection.ArrayList.list));
*/
    }

    public static void f(String name) {
        String a = "girl";
        return;

    }
}
