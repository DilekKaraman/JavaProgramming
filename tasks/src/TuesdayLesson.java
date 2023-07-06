import java.util.Scanner;

public class TuesdayLesson {

    public static void main(String[] args) {

String str="Hello";
str=str.toUpperCase();
str = str.substring(0,2);
        System.out.println(str);

        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        System.out.println(firstTwoChars(str1));

    }
    public static String firstTwoChars(String str1){
        str1=str1.toUpperCase().substring(0,2);
        return str1;
    }
}
