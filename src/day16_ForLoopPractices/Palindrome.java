package day16_ForLoopPractices;

public class Palindrome {
    public static void main(String[] args) {
        String word="Level";
        String reversed="";
        for (int i = word.length()-1; i >=0; i--) {
            reversed+=word.charAt(i);


        }
        boolean palindrome=word.equalsIgnoreCase(reversed);
        System.out.println(palindrome);
    }
}
