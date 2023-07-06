package day16;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number for 5 times");

        int pos=0;
        int neg=0;
        for (int i = 1; i <=5; i++) {
            int num = scan.nextInt();
            if (num > 0) {
                pos += 1;
            } else if (num < 0) {
                neg += 1;
            }
        }


        System.out.println(pos +" positive and "+ neg+" negative");
    }
}
