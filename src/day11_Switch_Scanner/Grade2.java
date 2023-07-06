package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch='A';

        switch (ch){
            case 'A':
                System.out.println("Excelent");
                break;

            case'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case'D':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");
        }
        System.out.println("--------------------------------------");

        char chhh='B';
        String result1="";
        switch (chhh) {
            case 'A':// A,B,C,D icin hep Passed sonucunu verir cunku onlara ayrica bir statement yazilmadi.
            case 'B':
            case 'C':
            case 'D':
                result1 = "Passed";
                break;
            default:
                result1 = "Failed";
        }
        System.out.println(result1);

        }
    }

