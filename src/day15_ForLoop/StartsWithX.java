package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a word:");
        String word=input.next();

       if(word.charAt(0)=='x'){
           System.out.println(word.replaceFirst("x","a"));
        }



    }
}
