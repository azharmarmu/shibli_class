import java.util.Scanner;


class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Entered name: ".concat(name));
        System.out.println("Is Empty: " + name.isEmpty());




        System.out.print("Enter Beginning Index: ");
        int bIndex = scanner.nextInt();
        System.out.print("Enter Ending Index: ");
        int eIndex = scanner.nextInt();


        // Enter substring from 2-4

        String op = name.substring(bIndex, eIndex);

        System.out.println("SubsString of " + name
                + " from index " + bIndex +
                " to " + eIndex + ": " + op);
    }
}


