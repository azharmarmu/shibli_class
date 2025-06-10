import java.util.Scanner;

public class Conditions {


    //Train fare
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter gender(M/F): ");
        String gender = scanner.next();

        //Train eligibility
        double trainFare = 100;
        if (age <= 5) {
            trainFare = 0;
        } else if (age < 12) {
            trainFare /= 2;
        } else if (gender.equals("f") || gender.equals("F")) {
            trainFare = trainFare - (trainFare * 0.2);
        } else if (age > 60) {
            trainFare = trainFare - (trainFare * 0.25);
        }

        System.out.print("Your train far: " + trainFare);

    }

}
