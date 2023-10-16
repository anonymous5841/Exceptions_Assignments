
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{

        A d = new A();


        int a = 0;
        int b = 0;

        int c[] = new int[4];
        Scanner sc = new Scanner(System.in);



        try{

            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(A.Divide(a,b));

        }

        catch(InputMismatchException e){


            System.out.println("the input you entered was not an integer");

            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(A.Divide(a,b));

        }


// try {
//
//     System.out.println("a/b = " + a / b);
//
// }
//
// catch (ArithmeticException e){
//
//     System.out.println();
// }
//
// try{
//     System.out.println(c[7]);
// }
//
// catch(ArrayIndexOutOfBoundsException e){
//
//     System.out.println("the index has exceeded the array length");
// }
//
//
// finally {
//
//     System.out.println("the program has reached its end successfully or unsuccessfully ");
// }
//
//        System.out.println("at the very very end" );
    }
}
