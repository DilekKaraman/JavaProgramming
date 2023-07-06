package day8;

public class MaxNum {
    public static void main(String[] args) {
       /* Write a program that can print the maximum number between two
        numbers, if both are equal then print Equal
        Ex:
        n1= 100, n2 = 200;
        output:
        200 is maximum number
        */
        int num1=100;
        int num2=200;
        if(num1>num2){
            System.out.println(num1+" is maximum number");
        }else if(num2>num1){
            System.out.println(num2+" is maximum number");
        }else
            System.out.println(num1+" = "+num2);
    }
}
