public class Book {
    private String name;
    private String author;

    public Book(String name, String mainCharacter) {
        this.name = name;
        this.author = mainCharacter;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + "]";
    }
}
