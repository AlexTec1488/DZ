package Text;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "document.doc";
        String newFilename = filename.replaceFirst("\\.doc", ",txt");
        System.out.println(newFilename);


        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); //hy how are you? me who
        boolean start = word.startsWith("h");

        String w = word.replace("h", "@")
                    .replace("a", "$");
        String r = word.replaceAll("[abcd]", "*");
        String t = word.replaceFirst("h", "3");
        String y = word.toString();


        System.out.println(start);
        System.out.println(w);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);

    }
}
