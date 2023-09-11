package do_while_for;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) // checks condition first, than proceeds
        {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // do // runs at least once, then checks condition
        // {
        // System.out.print("Enter your name: ");
        // name = scanner.nextLine();
        // }while(name.isBlank());

        // for (int i = 0; i < 5; i++) { // ask 5 times
        // System.out.print("Enter your name: ");
        // name = scanner.nextLine();
        // }

        System.out.println("Hello " + name);

        scanner.close();
    }

}
