package day21;

import java.util.Arrays;

public class EvenandOddCount {
    public static void main(String[] args) {

        /*Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
         */

        int[] num={4,5,8,80,97,55,37};
        int counteven=0;
        int countodd=0;
        for (int i = 0,j=0; i < num.length; i++,j++) {
            if(num[i]%2==0){
             counteven++;
            }else{
                countodd ++;
            }
        }
        System.out.println(counteven);
        System.out.println(countodd);
    }
}
