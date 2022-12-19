public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String parameter = args[0];

            System.out.printf("Hello %s!", parameter);
        } else {
            help();
        }
    }

    public static void help() {
        System.out.println("Dieses Programm nimmt einen Parameter entgegen und gibt diesen aus");
    }
}
