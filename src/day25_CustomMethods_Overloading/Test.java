package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {


        String str="Java Programming Language";

        StringUtility.printEachChar(str);
        System.out.println("_______________________________");

        String s1="Wooden Spoon";
       String reverse =StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("_______________________________");
        String word="Civic";
        boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("_______________________________");
String[] names= {"Anna", "Java", "Python", "Racecar","Mom", "Cydeo"};
int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("_______________________________");
String s2="aaaaaabbbbbbbcccccdddddddd";
String nunDup=StringUtility.removeDuplicates(s2);
        System.out.println(nunDup);

    }
}
