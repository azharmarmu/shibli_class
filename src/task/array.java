package task;

import java.util.Scanner;

public class array {
    // Array of Integers 45, 23, 5, 10, 2
    // Console Enter search value
    // If exists in Array print the index
    // Else Print Not found

    public static void main(String[] args) {

        int[] num = {45, 23, 5, 10, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to searched:");
        int value = scanner.nextInt();
        search(num, value);

    }

    static void search(int[] num, int value) {
        boolean found = false;
        int i;
        //Game Start
        for ( i = 0; i < num.length; i++) {
            if (num[i] == value) {
                found = true;
                break;

            }
        }
        //Game End

        if (found) {
            System.out.println("Found at index: "+i);
        } else {
            System.out.println("Not Found");
        }

    }


}