package day20_Arrays;

import java.util.Arrays;

public class Alfabet {
    public static void main(String[] args) {

        // 26 characters
        char alphabets[]=new char[26];//Z~A
        alphabets[0]='Z';
        System.out.println(Arrays.toString(alphabets));
        System.out.println(alphabets[0]);

        for (char i = 0,j='Z'; i<alphabets.length && j>='A' ; i++,j--) {
            alphabets[i]=j;

        }
        System.out.println(alphabets);


    }
}
