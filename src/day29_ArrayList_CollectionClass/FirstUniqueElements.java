package day29_ArrayList_CollectionClass;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> List= new ArrayList<>();

        List.add(1);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(5);
        System.out.println(List);

        for (Integer each : List) {
            int frequency=0;
            for(Integer element:List){
                if(element==each){
                    frequency++;
            }
            }
            if (frequency == 1) {
                System.out.println(each);
                break;
            }


        }



    }
}
