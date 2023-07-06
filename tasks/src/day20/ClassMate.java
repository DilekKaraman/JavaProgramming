package day20;

import java.util.Arrays;

public class ClassMate {
    public static void main(String[] args) {


String[] names={"Dilek Karaman", "Eda Akca", "Semra Oz","Tugba Yaray", "Yusuf Dogan", "Oscar Kocak", "Sally Eksi",
        "Tolganay Azeri", "Muhtar Cydeo", "Asya SDLC" };
        for (int i=0; i<names.length; i++) {


            System.out.println(names[i].charAt(0)+ "."+names[i].charAt(names[i].indexOf(" " )+1));
        }
        /*
        create an array named classmates, and store 10 of your classmates'
full names
print the initials of each classmates in separate lines
         */
    }
}
