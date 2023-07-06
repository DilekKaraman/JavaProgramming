package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("do you want to marry with me? yes/no");
        String ans=scan.next();
        while(!(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("no"))){
            System.out.println("Invalid answe please re-enter");
            ans=scan.next();

        }
        System.out.println(ans);
    }
}
