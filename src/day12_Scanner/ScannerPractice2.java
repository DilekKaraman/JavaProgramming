package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //System.out.println(" Enter true or False:");
        //boolean result=scan.nextBoolean();
        System.out.println("Enter your name:");
        String name=scan.next();// read the input until a space

        System.out.println("name: "+name);// Java

        scan.close();


    }
}
