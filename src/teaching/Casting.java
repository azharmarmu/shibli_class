package teaching;

public class Casting   {
    //implicit casting
    //explicit casting

    public static void main(String[] args) {
        String aS ="10";
        String dS ="10.0";
        String bS ="true";

        int a = Integer.parseInt(aS);
        double d = Double.parseDouble(dS);
        boolean b = Boolean.parseBoolean(bS);



        System.out.println(a);
        System.out.println(d);
        System.out.println(b);
    }
}
