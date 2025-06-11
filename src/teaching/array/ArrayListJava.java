package teaching.array;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {


        //Declaration / Creation
        ArrayList<String> names = new ArrayList<>() {{
            add("Alice");
            add("Bob");
            add("Charlie");
        }};

        ArrayList<Integer> age = new ArrayList<>() {{
            add(25);
            add(18);
            add(40);
        }};

        listIteration(age);
        listIteration(names);

//        names.add("Alex");
//
//
//        names.remove("Bob"); //value based removal
//        names.remove(2); //index based removal
//
//        names.add("New name");
//
//        boolean checkName = names.contains("Bob");
//        System.out.println("CheckName: " + checkName);
//
//
//        names.clear();
//        boolean checkEmpty = names.isEmpty();
//
//        System.out.println("CheckEmpty: " + checkEmpty);
//
//        listIteration(names);
    }


    //Iteration
    static void listIteration(@org.jetbrains.annotations.NotNull ArrayList al) {
        for (int i = 0; i < al.toArray().length; i++) {
            System.out.println(i + "=> " + al.get(i));
        }
    }


}
