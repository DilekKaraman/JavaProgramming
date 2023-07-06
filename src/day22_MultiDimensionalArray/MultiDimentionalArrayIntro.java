package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimentionalArrayIntro {
    public static void main(String[] args) {
String[] group1={"john", "joes", "james"};
String[] group2={"eda", "semmy", "Tahir"};
String[] group3={"Selcuk", "Omer", "Faruk"};

String[][] groups=new String[3][];
groups[0]=group1;
groups[1]=group2;
groups[2]=group3;

       // System.out.println(Arrays.toString(groups));// toString() is for one dimensional arrays only
        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------------------");
        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
        //indexof the elements:  0 1 2    0 1 2 3   0 1 2   3  4
                 int[][] arr2D={{1,2,3}, {4,5,6,7},{8,9,10,11,12}};
        //      index of arrays:   0          1          2
        System.out.println(Arrays.deepToString(arr2D));
        // {4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));
        //11
        System.out.println(arr2D[2][3]);
    }
}
