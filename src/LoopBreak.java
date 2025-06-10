import java.util.Scanner;

public class LoopBreak {

    public static void main(String[] args) {

        String name = "Alexander";

        System.out.print("Enter char to remove: ");
        String findChar = new Scanner(System.in).next().toLowerCase();


        //found first occurence
        for (int i = 0; i < name.length(); i++) {
            if (findChar.equals(String.valueOf(name.charAt(i)))) {
                break;
                //System.out.println("Found Char @ index: "+i);
            }
            System.out.println("Char => " + i + ": " + name.charAt(i));
        }


    }


}
