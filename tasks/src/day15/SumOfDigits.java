package day15;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text please");
        String text = scan.next();
        int sum = 0;


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - 48;

            }
        }
        System.out.println("sum = " + sum);

        scan.close();
    }
}
