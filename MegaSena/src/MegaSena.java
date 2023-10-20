import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        int x;
        Random generate = new Random();

        int number = generate.nextInt(60);
        System.out.println(number);
    }
}
