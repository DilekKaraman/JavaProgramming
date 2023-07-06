package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6};
       int[] result=new int[array.length];//{6,5,4,3,2,1}
        int j=0;
        for (int i = array.length-1; i >=0 ; i--,j++) {
            result[j]=array[i];


        }
        System.out.println(Arrays.toString(result));
        System.out.println("-------------------------------------------------");
        ArrayList<Integer> List=new ArrayList<>();
        List.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reversedList=new ArrayList<>();
        for (int i = List.size()-1; i >=0 ; i--) {
            int each=List.get(i);
reversedList.add(each);

        }
        System.out.println(reversedList);



    }
}
