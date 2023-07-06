package day21;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        /*Write a program that can merge 3 arrays of integers
Ex:
arr1 = {30, 10, 20};
arr2 = {15, 40, 25, 35};
arr3 = {8, 9, 17, 5, 4, 1}
Output:
{30,10,20,15,40,25,35,8,9,17,5,4,1}
         */
        int[] num1={30, 10, 20};
        int[] num2={15, 40, 25, 35};
        int[] num3={8, 9, 17, 5, 4, 1};
        int[] num4=new int[num1.length+num2.length+num3.length];
        int j=0;
        for (int each : num1) {
            num4[j++]=each;
        }
        for (int each : num2) {
            num4[j++]=each;
        }
        for (int each : num3) {
            num4[j++]=each;
        }

        System.out.print(Arrays.toString(num4));
    }
}
