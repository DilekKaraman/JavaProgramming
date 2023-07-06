package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
String[] countries={"Japan", "Korea", "united States", "Turkey", " United Kingdom", "Canada"};

        //converting array to arrayList:
        ArrayList<String> List=new ArrayList<>(Arrays.asList(countries));
        List.removeIf(p->p.length()>=10);

        //converting array to arrayList:
countries=List.toArray(new String[0]);


        System.out.println(Arrays.toString(countries));




    }
}
/*
1. Create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */