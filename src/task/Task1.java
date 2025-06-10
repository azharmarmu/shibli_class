
package task;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {

        //Get a name
        //Count of vowels & consant

        System.out.print("Enter your name: ");
        String name = new Scanner(System.in).next().toLowerCase();

        // vowels - a, e, i , o, u
        int length = name.length(); //4
        int i = 0;
        int vowelCount = 0;
        int consonentCount = 0;

        while (i < length) {
            char c = name.charAt(i);
            if ("aeiou".contains(String.valueOf(c))) {
                vowelCount++;
            }
            i++;
        }

        consonentCount = length - vowelCount;

        System.out.println("No.of Vowels: " + vowelCount);
        System.out.println("No.of Consonent: " + consonentCount);
    }
}
