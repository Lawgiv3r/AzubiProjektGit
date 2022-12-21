public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String parameter = args[0];
            Output.sayHello(parameter);
        } else {

            System.out.println("moin");
            help();
        }
    }

    public static void help() {
        System.out.println("Dieses Programm nimmt einen Parameter entgegen und gibt diesen aus");
    }

    public static List<Book> sortByAutor(ArrayList<Book> books){
      return  books.stream()
                .sorted(Comparator.comparing(Book::getMainCharacter)).collect(Collectors.toList());
    }
}
