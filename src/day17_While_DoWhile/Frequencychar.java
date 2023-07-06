package day17_While_DoWhile;

public class Frequencychar {
    public static void main(String[] args) {
        String str="AAABBBC";
        char ch='A';
        int fre=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch2=str.charAt(i);
            if(ch==ch2) {
                fre ++;
            }
        }
        System.out.println(fre);

    }
}
