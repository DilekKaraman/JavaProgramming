package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters=new char[26];

       /* letters[0]='A';
        letters[1]='B';
            .
            .
            .
        */
/*
        for (char i = 'A',j=0; i <'Z' && j<letters.length ; i++,j++) {
            letters[j]=i;
        }

 */
        char ch='A';

        for (int i = 0; i <letters.length ; i++) {
           letters[i]=ch++;


        }
        System.out.println(Arrays.toString(letters));
        System.out.println("----------------------------------------------");
        char[]letter2=new char[26];
        //z~a
        for (int j=25; j >=0 ; j--) {
            letter2[j]=ch++;


        }
        System.out.println(Arrays.toString(letter2));
    }
}
