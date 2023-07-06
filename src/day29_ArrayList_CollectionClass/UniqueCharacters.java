package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aabcccdeeeefggggggggiiiiiiijkkkkkkkl";

        ArrayList<String> List=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("List = " + List);

        String unique="";
        for (String each : List) {
           int frequency= Collections.frequency(List,each);
            if(frequency==1){
                unique+=each;
            }
        }

        System.out.println("unique = " + unique);

    }
}
