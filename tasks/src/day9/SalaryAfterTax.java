package day9;

import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        /*Write a program that can calculate the salary after tax based on the
following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5%
less tax
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary=scan.nextDouble();
        System.out.println("Are you married(true or false)" );
        boolean married=scan.nextBoolean();
        if(salary>=130000&&married){
            System.out.println("After tax salary: "+salary*0.7);
        }else if(salary>=130000&&!married){
            System.out.println("After tax salary: "+salary*0.65);

        }if(salary>=100000&& salary<130000 &&married){
            System.out.println("After tax salary: "+salary*0.75);
        }else if(salary>=100000&& salary<130000 &&!married){
            System.out.println("After tax salary: "+salary*0.7);
        }if(salary>=80000&& salary<100000 &&married){
            System.out.println("After tax salary: "+salary*0.8);
        }else if(salary>=80000&& salary<100000 &&!married){
            System.out.println("After tax salary: "+salary*0.75);
        }if(salary<80000 &&married){
            System.out.println("After tax salary: "+salary*0.85);
        }else if(salary<80000 &&!married){
            System.out.println("After tax salary: "+salary*0.8);
        }


    }
}
