package day15;

import java.util.Scanner;

public class SumOfAllNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scan.nextInt();
        int sum=0;

        for (int i = 0; i <=num ; i++) {
            sum+=i;
        }
        System.out.println("sum= "+sum);
        scan.close();

    }
}
