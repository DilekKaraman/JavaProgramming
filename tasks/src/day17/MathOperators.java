package day17;

import java.util.Scanner;

public class MathOperators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        System.out.println("Enter a math operator");
        char operator= scan.next().charAt(0);
        while(!(operator==('*')||operator==('+')||operator==('/')||operator==('-'))){
            System.out.println("Invalid operator, please re-enter an operator");
            operator=scan.next().charAt(0);
        }
        double result;
        if(operator=='+'){
           result=num1+num2;
        }else if(operator=='-'){
            result=num1-num2;
        }else if(operator=='*') {
            result = num1 * num2;
        }else{
            result=num1/num2;
        }
        System.out.println("result = " + result);

        scan.close();
    }
}
