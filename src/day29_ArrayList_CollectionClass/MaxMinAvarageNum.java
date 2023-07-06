package day29_ArrayList_CollectionClass;

import java.util.ArrayList;

public class MaxMinAvarageNum {
    public static void main(String[] args) {

        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);

        System.out.println(List);

        int max=List.get(0);
        int min=List.get(0);
        int sum=0;
        for (Integer each : List) {

            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
            sum +=each;

            
        }
        double average=sum/List.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);


    }
}
