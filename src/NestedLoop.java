public class NestedLoop {


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

//            System.out.println("*".repeat(i));

            for (int j = 1; j <= i; j++) {
                System.out.print(String.valueOf(i) + '\t');
            }
            System.out.println();
        }
    }
}

/*
 *  i =0 , j=0 ,  print i //0
 *  i =0 , j=1 ,  print i //0
 *  i =0 , j=2 ,  print i //0
 *  i =0 , j=3 ,  print i //0
 *  i =0 , j=4 ,  print i //0
 *  i =1 , j=0 ,  print i //1
 *  i =1 , j=1 ,  print i //1
 *  i =1 , j=2 ,  print i //1
 *  i =1 , j=3 ,  print i //1
 *  i =1 , j=4 ,  print i //1
 * */