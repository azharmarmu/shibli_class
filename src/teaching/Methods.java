package teaching;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        System.out.println(add(10, 20)); //Method call
        System.out.println(add(20, 40)); //Method call
        array2D('*');
        array2D('#');


    }


    //Method Create or Method Definition/Declaration
    static void getName() {
        Scanner scanner =
                new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.next();

        System.out.println("Hello " + name);
    }

    static double add(int a, int b) {

        return a + b;
    }


    static void array2D(char c) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(String.valueOf(c) + '\t');
            }
            System.out.println();
        }

    }

}
