package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num1=scan.nextInt();
        System.out.println("Enter a decimal number: ");
        double num2=scan.nextDouble();
        System.out.println("Multiplication: "+(num1*num2));

scan.close();// close the scanner
        System.out.println("Enter an integer number: ");
        int num3=scan.nextInt();


    }
}
