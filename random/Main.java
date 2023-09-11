package random;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6) + 1;
        System.out.println("Roll a dice 1-6: " + x);

        double y = random.nextDouble();
        System.out.println("Random double between 0 and 1: " + y);

        boolean z = random.nextBoolean();
        System.out.println("Random bool: " + z);

    }

}
