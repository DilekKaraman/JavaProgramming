package week9;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20.5));
double sum=add(4,5);
        System.out.println(sum);

        int sum2=(int)add(4,5); // add method returns double so you need to cast it to int---expilicit casting

        System.out.println("100*200: "+multiply(100,200));

    }

    public static double add(double num1, double num2){
        double result=num1+num2;
        return result;
    }
    public static double substract(double num1, double num2){
        double result=num1-num2;
        return result;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;

    }
    public static double divide(double num1, double num2){
        return num1/num2;

    }
}
