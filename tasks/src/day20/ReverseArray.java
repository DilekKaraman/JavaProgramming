package day20;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int[] reverse=new int[numbers.length];
        for (int i=numbers.length-1, j=0;i>=0;i--,j++){
           reverse[j] =numbers [i];
        }
        System.out.println(Arrays.toString(reverse));



        /*Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};

         */
    }
}
