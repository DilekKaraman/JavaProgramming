package day19_LoopPractices;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("would you like to enter another number?(yes or no)");
            String a = scan.next().toLowerCase();
            if (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid entry");
                System.exit(0);
            }
            if (a.equals("no")) {
                System.out.println("Thank you");
                break;
            }

        }

    }
}
