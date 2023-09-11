package arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList = resizable array. Elements can be added and removed after
        // compilation phase

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("salad");

        food.set(1, "sushi");
        food.remove(0);
        food.clear();

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }

}
