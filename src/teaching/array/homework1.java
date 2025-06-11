package teaching.array;

import java.util.ArrayList;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        int value = scanner.nextInt();

        // Store numbers as strings but for search we compare integers
        ArrayList<String> num = new ArrayList<>() {{
            add("22");
            add("25");
            add("28");
            add("50");
            add("55");
            add("60");
            add("70");
        }};

        search(num, value);
    }
    static void search(ArrayList<String> num, int value) {
        boolean found = false;
        int index = -1;

        for (int i = 0; i < num.toArray().length; i++) {
            if (Integer.parseInt(num.get(i)) == value) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
