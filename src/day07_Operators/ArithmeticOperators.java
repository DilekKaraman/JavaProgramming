package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1=10;
        int num2=3;

        int division= num1/num2;
        int remainder= num1%num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("division = " + division);
        System.out.println("remainder = " + remainder);
        // 10 divide by 3 is equal to 3 with reminder of 1
        System.out.println(num1 + " divide by " + num2 + " is equal to "+ division + " with remainder of "+ remainder);

    }
}
