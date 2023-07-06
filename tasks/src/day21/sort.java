package day21;

import java.util.Arrays;

public class sort {

    public static void main(String[] args) {
        /*Write a program that sort the array of integer in descending
order*/

int[] num={3,6,4,90,67,54,2};
        Arrays.sort(num);

int[] reverse=new int[num.length];

        for (int i = num.length - 1,j=0; i >= 0; i--,j++) {
           reverse[j]=num[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
