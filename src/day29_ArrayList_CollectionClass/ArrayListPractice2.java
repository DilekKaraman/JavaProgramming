package day29_ArrayList_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employess=new ArrayList<>();
        employess.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));

        employess.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employess);
        System.out.println("----------------------------------------------------------------------");

        String[] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> List=new ArrayList<>(Arrays.asList(names));
        List.removeIf(p-> p.charAt(0)=='M');
        System.out.println(List);

       names= List.toArray(new String[0]);
        System.out.println(Arrays.toString(names));



    }
}
