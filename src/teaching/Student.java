package teaching;

import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.next();

        int len = name.length();
        // usecase
        // fetch user name first letter and last letter;

//        int a = 10;
//        String b = String.valueOf(a);
//
//
//        String op = String.valueOf(name.charAt(0)) + name.charAt(len - 1);
//        System.out.print("First & Last Char: " + op);


        // Enter substring from 2-4

        String op = name.substring(2);

        System.out.print("SubsString of " + name + " from index 2: " + op);

        //teaching.Methods of String
        // toUpperCase, toLowerCase
        // length
        // charAt
        // subString


    }
}


