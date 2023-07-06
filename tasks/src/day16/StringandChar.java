package day16;

import java.util.Scanner;

public class StringandChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text=scan.nextLine();
        System.out.println("Select a char:");
        char ch=scan.nextLine().charAt(0);
        int frequency=0;
        for (int i = 0; i < text.length(); i++) {

            char ch2=text.charAt(i);
            if(ch2==ch){
                frequency +=1;
            }
        }

        System.out.println(frequency);
        scan.close();
    }
        }
