import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter gender(M/F/O): ");
        String gender = scanner.next();

        //Train eligibility
        double trainFare = 100;

        double discountPer = switch (gender) {
            case "F" -> 0.25;
            case "O" -> 0.15;
            default -> 0;
        };

//        switch (gender) {
//            case "F":
//                discountPer = 0.25;
//                break;
//            case "O":
//                discountPer = 0.15;
//                break;
//            default:
//                discountPer = 0;
//        }

        // lot of if-else if
        // same variable
        // equal


        trainFare -= (trainFare * discountPer);


        System.out.print("Your Train fare: " + trainFare);
    }
}
