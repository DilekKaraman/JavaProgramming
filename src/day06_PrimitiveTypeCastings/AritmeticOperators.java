package day06_PrimitiveTypeCastings;

public class AritmeticOperators {
    public static void main(String[] args) {
        System.out.println("12"+1);// 121 concatenation

        System.out.println(10+20);// 30 addition
        System.out.println(30-10);// 20 substraction
        System.out.println(10*6);// 60 multiplication

        System.out.println(100/3); //33
        System.out.println(10/4);//2
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4);//2.5

        int a=100;
        double b = a/6;//16
        System.out.println(b);


                double c= a/6d; // 16.666666

        System.out.println(c);
    }
}
/*
+: Addition
-: Substract
*: Multiplication
/: Division
    in math:
    10/4=2.5

    in java
    10/4=2
    10.0/4=2.5

%: Modulus, reminder



 */