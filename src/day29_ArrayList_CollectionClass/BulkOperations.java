package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(List);

        List.removeAll(Arrays.asList(3,5,8));
        System.out.println(List);

ArrayList<Integer> numbers=new ArrayList<>();
numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);
        System.out.println("--------------------------------------------------");

        ArrayList<String > JobTitles=new ArrayList<>();
        JobTitles.addAll(Arrays.asList("QA","SDET","Developper","QA","SDET","Scrum Master","BA","BA"));
        JobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(JobTitles);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,71,2,3,8,9,10));

        boolean r1=nums.contains(10);
        boolean r2=nums.contains(2) && nums.contains(10);
boolean r3= nums.containsAll(Arrays.asList(2,5,10,1000));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("--------------------------------------------------");
        String[] names={"Josh","Jack","Daniel","Shay","Breanna"};
        ArrayList<String> namesList=new ArrayList<>(Arrays.asList(names));
        /*
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);
         */

        System.out.println(namesList);

        System.out.println("--------------------------------------------------");
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> List2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(List2);
        System.out.println("---------------------------------------------------");

        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>List3=new ArrayList<>(convertArrayToArrayList(arr2));

    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
ArrayList<Integer> List=new ArrayList<>();

        for (int each : array) {
            List.add(each);
        }

return List;

    }
}
