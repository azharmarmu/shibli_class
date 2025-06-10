package task;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        double addResult = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();

            addResult += add(a, b);
            System.out.println("Addition: " + addResult);
        }

    }

    // function or method
    static double add(double i, double j) {
        return i + j;
    }
}
