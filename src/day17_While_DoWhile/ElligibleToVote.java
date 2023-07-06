package day17_While_DoWhile;

import java.util.Scanner;

public class ElligibleToVote {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scan.nextInt();
        while(!(age>=1&&age<=120)){
            System.out.println("Invalid entry, please re-enter");
            age=scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer=scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer please re-enter");
            answer=scan.next();
        }

        if(age>=18&&answer.equalsIgnoreCase("yes")){
            System.out.println("Elligible to vote");
        }else{
            System.out.println("Not eligible");
        }
scan.close();


    }
}
