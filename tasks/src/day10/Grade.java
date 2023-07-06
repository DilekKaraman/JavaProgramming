package day10;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        /*Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a grade:");
        char grade=input.next().charAt(0);
        boolean valid= grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F';
        if(valid){
            if(grade=='A'){
                System.out.println("Excellent");
            }else if(grade=='B'){
                System.out.println("great job");
            }else if(grade=='C'){
                System.out.println("good");
            }else if(grade=='D'){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
