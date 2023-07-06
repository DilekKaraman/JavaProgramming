package day16;

import java.util.Scanner;

public class JavaFrequency {
    public static void main(String[] args) {
/*String str = "javajava";

        int count = 0;
        for(int i= 0 ; i <= str.length()-4; i++){ //i:0 , 1, 2,3, 4

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;

 */
        String str="JavaJava";
        int result=0;
        for (int i = 0; i <=4 ; i++) {
            String s=str.substring(i,i+4);
            if(s.equalsIgnoreCase("Java")){
                result +=1;
            }

        }
        System.out.println(result);
    }
}
