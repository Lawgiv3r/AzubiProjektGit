import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String parameter = args[0];
            Output.sayHello(parameter);
        } else {

            System.out.println("moin");
            help();
        }

        sortByAutor(BookDetails.bookDetails()).forEach(System.out::println);
    }

    public static void help() {
        System.out.println("Dieses Programm nimmt einen Parameter entgegen und gibt diesen aus");
    }

    public static List<Book> sortByAutor(ArrayList<Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getAuthor)).collect(Collectors.toList());
    }
}
