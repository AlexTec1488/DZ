package Massiv.CycleMassif;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] name = { "Саша", "Илья", "Кирилл", "Филипп", "Антон", "Андрей", "Анастасия" };

        for (int i = 0; i < name.length; i++) {
            if (!name[i].startsWith("А") || name[i].startsWith("С")) {
                //System.out.println(name[i]);
            }
        }
        for (String names : name){
            if (names.startsWith("А")) {
                //System.out.println(names.replace("н", "@"));
            }
        }
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

    }
}
