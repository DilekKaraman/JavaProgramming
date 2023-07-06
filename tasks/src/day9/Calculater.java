package day9;

public class Calculater {
    public static void main(String[] args) {
        /*
        Create a class called Calculator, Given two double variables named n1
& n2, and a char variable named mathOperator, write a program that can
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30
         */
        double n1=2.5;
        double n2=2;
        char mathOperator='*';
        double result;
        if(mathOperator=='+'){
            result=n1+n2;
            System.out.println(result);
        }else if(mathOperator=='-'){
            result=n1-n2;
            System.out.println(result);
        }else if(mathOperator=='*'){
            result=n1*n2;
            System.out.println(result);
        }else if(mathOperator=='/'){
            result=n1/n2;
            System.out.println(result);
        }else
            System.out.println("invalid operator");
    }
}
