package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int num= 200;
        boolean ispositive= num>0;
        System.out.println("ispositive = " + ispositive);
        boolean isNegative= num<0;
        System.out.println("isNegative = " + isNegative);
        boolean isZero= num==0;
        System.out.println("isZero = " + isZero);

        System.out.println(num + " is positive number: "+ ispositive);
        System.out.println(num + " is negative number: "+ isNegative);
        System.out.println(num +" is zero: "+ isZero);


    }
}
