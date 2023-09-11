package math;

public class Main {

    public static void main(String[] args) {

        double x = 3.14;
        double y = 10;

        System.out.println("Max: " + Math.max(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("Absolut value: " + Math.abs(y));
        System.out.println("Square root: " + Math.sqrt(x));
        System.out.println("Round: " + Math.round(x));
        System.out.println("Ceil: " + Math.ceil(x));
        System.out.println("Floor: " + Math.floor(x));

        System.out.println("Hypotenuse: " + calcHypotenuse(x, y));

    }

    public static double calcHypotenuse(double x, double y) {
        return Math.sqrt((x * x) + (y * y));
    }

}
