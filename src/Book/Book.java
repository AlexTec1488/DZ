package Book;

public class Book {


    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }
    public boolean matches(String word){
        return title.contains(word) || author.contains(word);
    }

    public int estimatePrice() {
        int price = 3 * pages;
        return Math.max(price, 250);
    }

    public int ger() {
        int r = 4 * releaseYear;
        return Math.max(r, 200);

    }


}
