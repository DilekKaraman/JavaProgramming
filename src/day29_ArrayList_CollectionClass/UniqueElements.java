package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> List=new ArrayList<>();
        List.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique=new ArrayList<>();

        for (Integer each : List) {
            int frequency= Collections.frequency(List,each);
            if(frequency==1){
                unique.add(each);
            }

        }
        System.out.println(unique);
        System.out.println("--------------------------------------------");

        ArrayList<Integer> List2=new ArrayList<>();
        List2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique2=new ArrayList<>(List2);
        unique2.removeIf(p-> Collections.frequency(List2,p)>1);
        System.out.println("unique2 = " + unique2);


    }
}
