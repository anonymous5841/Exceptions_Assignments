public class A {


    static String Divide(int m, int n)throws ArithmeticException{

        try {

            return String.format("a/b = " + m / n);

 }
        catch(ArithmeticException e){

            return String.format(" ArithmeticException You are dividing by zero");
        }

    }
}
