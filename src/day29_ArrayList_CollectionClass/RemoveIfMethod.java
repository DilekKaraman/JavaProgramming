package day29_ArrayList_CollectionClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> List= new ArrayList<>();
        List.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

       /* for (int i = 0; i < List.size(); i++) {
            if(List.get(i)%2!=0){
                List.remove(i);
            }
        }

        */
        System.out.println(List);
List.removeIf(p-> p<5);
        System.out.println(List);

        System.out.println("-------------------------------------------");
        ArrayList<Integer> List2=new ArrayList<>();
        List2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List2.removeIf(each->each%2==0);
        System.out.println(List2);
        System.out.println("-------------------------------------------");
        ArrayList<String> List3=new ArrayList<>();
        List3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));

        List3.removeIf(p-> p.startsWith("J"));
        System.out.println(List3);

        System.out.println("-------------------------------------------");
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));

        names.removeIf(name-> StringUtility.isPalindrome(name));
        System.out.println(names);




    }
}
