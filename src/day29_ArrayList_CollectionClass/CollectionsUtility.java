package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> List=new ArrayList<>();
        List.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(List);
        System.out.println(List);
        System.out.println("-------------------------------------------------");
        ArrayList<Character> List2=new ArrayList<>();
        List2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(List2);
        Collections.reverse(List2);
        System.out.println(List2);
        System.out.println("-------------------------------------------------");

        ArrayList<Integer> List3=new ArrayList<>();
        List3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(List3,4,1);
        System.out.println(List3);

        System.out.println("-------------------------------------------------");

        int max= Collections.max(List3);
        int min= Collections.min(List3);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("-------------------------------------------------");

        ArrayList<Integer> List4=new ArrayList<>();
        List4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(List4,10,1000);
        System.out.println(List4);
        System.out.println("-------------------------------------------------");
        int frequency=Collections.frequency(List4,1000);
        System.out.println(frequency);
        System.out.println("-------------------------------------------------");
        ArrayList<String > words=new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Python","Python","Ruby","C#"));
        int countJava=Collections.frequency(words,"Java");
        int countPython=Collections.frequency(words,"Python");

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);


    }
}
