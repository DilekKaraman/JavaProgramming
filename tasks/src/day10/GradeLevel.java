package day10;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a level:");
        byte number=scan.nextByte();
        if(number>=1&&number<+18){
            if(number>=1&&number<=5){
                System.out.println("Elementary school");

            }else if(number>=6&&number<=8){
                System.out.println("Middle school");
            }else if(number>=9&&number<=12){
            System.out.println("High school");
        }else if(number>=13&&number<=16){
            System.out.println("College");
        }else if(number>=17&&number<88){
            System.out.println("Grad school");
        }
        }else{
            System.out.println("Invalid");
        }
    }
}
