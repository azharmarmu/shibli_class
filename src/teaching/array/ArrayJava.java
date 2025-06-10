package teaching.array;

import java.util.Scanner;

public class ArrayJava {


    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    public static void main(String[] args) {

        int[] a = {5, 3, 4, 1, 2};


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the value to be searched: ");
            int searchValue = scanner.nextInt(); //10
            searchArray(a, searchValue); //method call
        }

    }

    int a = 10;


    double methodName1() {
         methodName1();
        return 10;
    }


    //method declaration
    static void searchArray(int[] array, int searchValue) {
        boolean matchFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                System.out.println("Found value " + searchValue + " @ index: " + i);
                matchFound = true;
                break;
            }
        }
        if (!matchFound) {
            System.out.println("Not Found value " + searchValue);
        }
    }
}
