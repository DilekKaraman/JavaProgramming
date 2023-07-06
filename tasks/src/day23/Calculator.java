package day23;

public class Calculator {
    public static void main(String[] args) {
        calculator(4,2,'/');
    }
    public static void calculator(double num1, double num2,char operator){
        double result=0.0;
        if(operator=='-'||operator=='+'||operator=='/'||operator=='*'){
            if(operator=='-'){
                result+=(num1-num2);
            }else if(operator=='+'){
                result+=(num1+num2);
            }else if(operator=='/'){
                result+=(num1/num2);
            }else{
                result+=(num1*num2);
            }
        }else{
            System.out.println("Invalid");
        }
        System.out.println("result = " + result);

    }
}
/*create a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result

 */