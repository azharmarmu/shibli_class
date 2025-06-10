package teaching;

public class Operators {

    public static void main(String[] args) {
        //teaching.Operators

        //Arithmetic operation (+, - , *, /,  %)
        int a = 10;
        int b = 6;

        //Add
//        System.out.println(a+b);
//
//        //Sub
//        System.out.println(a-b);
//
//        //Mul
//        System.out.println(a*b);
//
//        //Div
//        System.out.println(a/b); //Dart error
//
//        //Mod
//        System.out.println(a%b);


        //Assignment operators ( =, +=, -=, *=, /=, %=)
        String name = "Alex";

        int aa = 30;


        aa += 20; // aa = aa + 20;

        //System.out.println(aa);

        //increment & decrement operator (a++, ++a, a--, --a)

        a = a + 1;

        a += 1;

        a++;
        ++a;

        System.out.println("a: " + a);

        b = b - 1;

        b -= 1;

        b--;
        --b;
        //System.out.println(b);

        //a : 14
        int age = 20;
        //age: 20
        int incAge = ++age; // age = age +1;

        System.out.println("new age: " + age);
        System.out.println("incAge: " + incAge);


    }
}
