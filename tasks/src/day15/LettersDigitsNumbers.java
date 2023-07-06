package day15;

import java.util.Scanner;

public class LettersDigitsNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter atext: ");
        String text = scan.next();
        String letter = "";
        String special = "";
        String number = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                letter += ch;

            } else if (ch >= 'A' && ch <= 'Z') {
                letter += ch;

            } else if (ch >= '0' && ch <= '9') {
                number += ch;
            } else {
                special += ch;
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("number = " + number);
        System.out.println("special = " + special);
        scan.close();
    }
}