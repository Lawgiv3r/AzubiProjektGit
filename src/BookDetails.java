import java.util.ArrayList;

public class BookDetails {
    public static ArrayList<Book> bookDetails() {
        ArrayList<Book> books = new ArrayList<>();
        Book nr1 = new Book("Harry Potter", "J.K. Rowling");
        Book nr2 = new Book("Chronicles of Narnia", "C.S Lewis");
        Book nr3 = new Book("The Hunger Games", "Suzanne Collins");
        Book nr4 = new Book("The Lord of The Rings", "J.R.R Tolkien");
        Book nr5 = new Book("The Help", "Kathryn Stockett");
        Book nr6 = new Book("The Stand", "Stephen King");
        Book nr7 = new Book("Matilda", "Roald Dahl");
        Book nr8 = new Book("Hamlet", "William Shakespeare");
        Book nr9 = new Book("Divergent", "Veronica Roth");
        Book nr10 = new Book("The Book Thief", "Markus Zusak");

        books.add(nr1);
        books.add(nr2);
        books.add(nr3);
        books.add(nr4);
        books.add(nr5);
        books.add(nr6);
        books.add(nr7);
        books.add(nr8);
        books.add(nr9);
        books.add(nr10);

        // System.out.println(books.get(1).getName() + books.get(2).getAuthor());
        return books;
    }
}
