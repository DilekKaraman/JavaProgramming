package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();
        System.out.println("age:"+age);
        System.out.println("full name:"+fullName);
    }
}
