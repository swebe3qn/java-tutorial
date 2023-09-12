package methods;

public class Main {

    public static void main(String[] args) {
        hello("Stefan");

        System.out.println(add(1, 3));
        System.out.println(add(1, 3, 5));
        System.out.println(add(1, 3, 5, 7));
        System.out.printf("The result is %20.2f\n", add(1.0, 3.0));
        System.out.printf("The result is %20.2f\n", add(1.0, 3.0, 5.0));
        System.out.printf("The result is %20.2f\n", add(1.0, 3.0, 5.0, 7.0));
    }

    // method
    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    // overloaded methods - same name, different params (name + params = signature)
    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static int add(int x, int y, int z, int a) {
        return x + y + z + a;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static double add(double x, double y, double z) {
        return x + y + z;
    }

    static double add(double x, double y, double z, double a) {
        return x + y + z + a;
    }

}
