package day15;

public class Palindrome {
    public static void main(String[] args) {
        String str="Anna";
        String str2="";

        for (int i =str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            str2 += ch;
        }
            if(str.equalsIgnoreCase(str2)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


    }
}
