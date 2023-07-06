package day23;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
anagram("Level","Cydeo");
    }
    public static void anagram(String word1,String word2){
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
/*create a method that can check if two strings are anagram

 */