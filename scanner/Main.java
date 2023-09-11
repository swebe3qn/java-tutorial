package scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("What is your name?");
            String name = scanner.nextLine();

            System.out.println("How old are you?");
            int age = scanner.nextInt();
            scanner.nextLine(); // clear scanner

            System.out.println("What is your favorite food?");
            String food = scanner.nextLine();

            System.out.println("Hello " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("You like " + food);
        } catch (Exception e) {
            System.out.println("There was an error. Please make sure to answer all questions in the right format.");
        }

        scanner.close();

    }

}
