package week02;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("10/3: "+ (10/3));
        System.out.println("10/3.0: "+ (10/3.0));
        // if you don't write () inside your calculating, java write as concatination at output.
        // System.out.println("10/3.0: "+ 10 +3) 103 eg

        int num1=10;
        double num2 = 3.0;
        int result= (int) (num1/num2);// expilicit casting
        System.out.println("result = " + result);


    }
}
