package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your programming Language:");
        String programming=scan.nextLine();
        System.out.println("Enter your age: ");
        int age=scan.nextInt();
        System.out.println("Enter your first name:");
        String firstName=scan.next();

scan.nextLine();


        System.out.println("Enter your school:");// sayi ve kelimeden sonra cumle girdireceksen oncesinde ve sonrasinda nextLine tanimlamak zorundasin
        String schoolName=scan.nextLine();


        System.out.println("fullName: "+fullName);
        System.out.println("programming: "+programming);
        System.out.println("age:"+age);
        System.out.println("School Name: "+schoolName);

    }
}
