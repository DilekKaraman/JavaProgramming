package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;

        if (0 <= score && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Fail");
            }

        } else {
            System.out.println("Invalid score");

        }

        System.out.println("---------------------------------");

        int num = 5;
        if (num >= 1 && num <= 7) {
            if (num == 1) {
                System.out.println("Monday");
            } else if (num == 2) {
                System.out.println("Tuesday");
            } else if (num == 3) {
                System.out.println("Wednesday");
            } else if (num == 4) {
                System.out.println("Thursday");
            } else if (num == 5) {
                System.out.println("Friday");
            } else if (num == 6) {
                System.out.println("Saturday");
            } else if (num == 7) {
                System.out.println("Friday");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}

