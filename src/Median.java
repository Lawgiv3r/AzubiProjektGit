import java.util.Random;

public class Median {
    public static void median(){
        Random numbers = new Random();
        int x = 0;
        int counter = 0;
        int length = 20;

        for (int i = 0; i < length; i++) {
            int randomNumber = numbers.nextInt(0,100);
            
            x = randomNumber + x;
            System.out.println(randomNumber);
            counter++;
        }

        int median = x / counter;
        System.out.println("median: " + median);
    }


public static void main(String[] args) {
    median();
}

}
