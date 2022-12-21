import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // call createTxtFile
        try {
            createTxtFile("Test");
        } catch (Exception e) {
            System.out.println("Exception");
            // TODO: handle exception
        }

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

    public static void createTxtFile(String txt) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
        writer.write(txt);
        writer.close();
    }
}
