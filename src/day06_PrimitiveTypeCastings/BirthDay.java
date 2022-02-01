package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {

        /*
        if name="John"
        birthDay= 25
        birthMonth="April"
        birthYear= 1995;
        output:
        John was born on April/25/1995.
         */

        String name= "John",
                birthMonth="April";
        int birthDay= 25,
                birthYear=1995;
        System.out.println(name + " was born on " + birthMonth + "/"+birthDay+ "/" + birthYear+".");
// My favorite book is "bookName"
        String bookName= "The Rich Dad and The Poor Dad";
        System.out.println("My favorite book is "+ "\"" + bookName+"\"");

    }
}
