package day41_ExceptionsIntro;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {

        //unchecked exceptions:

        int a=10;
        int b=0;

        //System.out.println(a/b);
       // System.out.println("Woodon Spoon");
        
char[] characters={'A','B','C'};
//                  0,  1,  2
        //System.out.println(characters[99]);

        Student student=null;
       // System.out.println(student.getName());
        //student.study();
       String str="Wooden Spoon";
       str=null;
       // System.out.println(str.toUpperCase());

        String str2="";// object!=null
        System.out.println(str2.isEmpty());

        //checked Exception:

        System.out.println("Hello");
       // Thread.sleep(3000);

        System.out.println("Cydeo");
       // FileInputStream file=new FileInputStream("path of the file");// checked Exception

      //  System.out.println("java".charAt(20000));//unchecked Exception








    }

}
