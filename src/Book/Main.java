package Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Евгений Онегин", 1853, "Александр Пушкин", 416);
        System.out.println(book.isBig());
        System.out.println(book.matches("Евгений"));
        System.out.println(book.estimatePrice());
        System.out.println(book.ger());
    }
}
