package Collection.Generic;

public class Main {
    public static void main(String[] args) {
        Integer i = 100;
        Number n = i;
        Memory<Number> memory = new Memory<>();
        memory.save(4.5);
        /*memory.save("petya");
        memory.save("olya");
        memory.save("tanya");
        String value = memory.getLast();
        System.out.println(value);*/

        String v1 = "car1";
        String v2 = "car2";
        String result = Main.choose(true, v1, v2);
        System.out.println(result);
    }

    public static <So extends Object> So choose(boolean flag, So first, So second) {
        if (flag) {
            return first;
        } else {
            return second;
        }
    }

}
