package day15;

import java.util.Scanner;

public class FactorielNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a factoriel number:");
        int num=scan.nextInt();
        int result=1;
        for (int i =num; i>=1 ; i--) {
            result *= i;
        }
        System.out.println("result= "+ result);
        scan.close();
    }
}
