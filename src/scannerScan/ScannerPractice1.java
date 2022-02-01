package scannerScan;

import java.util.Scanner;


public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println(" enter an integer number:");
        int num1=input.nextInt();
        System.out.println("Enter a decimal number:");
double num2= input.nextDouble();

        System.out.println("Enter a word:");
        String word= input.next();
        System.out.println("Enter your first sentences:");
        String firstSentence= input.nextLine();
        input.nextLine();
        System.out.println("Enter your second sentences:");
        String secondSentences=input.nextLine();




    }
}
