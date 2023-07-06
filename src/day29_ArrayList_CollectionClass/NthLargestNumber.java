package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.addAll((Arrays.asList(1,2,3,4,5,6,7,7,8,8)));

       int n=3;
        for (int i = 1; i <n ; i++) {
          List.removeIf(p->Collections.max(List)==p);

        }

        int max=Collections.max(List);
        System.out.println(max);





    }
}
