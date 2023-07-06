package day21;

import java.util.Arrays;

public class CountPolindrom {
    public static void main(String[] args) {

        /*write a program that can count how many palindromes in an array of
string
Ex:
{"anna", "level", "Java"};
output:
2 */
   String[] words= {"anna", "level", "Java"};
int count=0;
        for (int i = 0; i < words.length; i++) {
            String reverse="";
            for(int j=words[i].length()-1;j>=0; j--){
               reverse +=words[i].charAt(j);
                if(reverse.equalsIgnoreCase(words[i])){
                    System.out.println(words[i]+" is a polindrom word");
count ++;
                }

            }

        }
        System.out.println(count);
    }
}
