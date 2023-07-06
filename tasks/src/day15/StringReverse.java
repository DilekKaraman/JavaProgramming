package day15;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Plese enter your text");
        String str=scan.nextLine();
        String str2="";
        for (int i = str.length()-1; i >=0; i--) {
            char ch=str.charAt(i);
            str2 +=ch;
        }
        System.out.println(str2);
        scan.close();
    }
}
