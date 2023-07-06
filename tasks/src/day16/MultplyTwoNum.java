package day16;

import java.util.Scanner;

public class MultplyTwoNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two possitive number:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int result=0;

        for (int i = 1; i <=num2 ; i++) {
           result +=num1;
        }
        System.out.println(result);
        scan.close();
    }
}
