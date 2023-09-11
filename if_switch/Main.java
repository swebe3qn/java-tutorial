package if_switch;

public class Main {

    public static void main(String[] args) {

        byte age = 23;

        if (age >= 65) {
            System.out.println("Hello senior");
        } else if (age >= 18) {
            System.out.println("Hello adult");
        } else {
            System.out.println("Hello child");
        }

        String day = "tuesday";

        switch (day) {
            case "monday":
                System.out.println("It is monday");
                break;
            case "tuesday":
                System.out.println("It is tuesday");
                break;
            case "wednesday":
                System.out.println("It is wednesday");
                break;
            case "thursday":
                System.out.println("It is thursday");
                break;
            case "friday":
                System.out.println("It is friday");
                break;
            case "saturday":
                System.out.println("It is saturday");
                break;
            case "sunday":
                System.out.println("It is sunday");
                break;
            default:
                System.out.println("That is not a day");
        }

    }

}
