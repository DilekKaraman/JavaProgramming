package day21_forEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        String[] students={"Elif","Sinem", "Gunay","James","Aaron", "Daniel"};
        String[] earlyBirds=Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers={1,2,3,4,5,6,7,8,9,10};

        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------------------");

        char[] ch1={'A','B','C','D','F','G','H','I'};
        char[] ch2=Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));

        int[] score={10,20,30,40,50,60,70,80,90,100};
        // index      0  1  2  3  4  5  6  7  8  9
        int[] result=Arrays.copyOfRange(score,3,8);
        System.out.println(Arrays.toString(result));



    }
}
