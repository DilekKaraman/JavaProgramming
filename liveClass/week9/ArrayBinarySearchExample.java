package week9;

import java.util.Arrays;

public class ArrayBinarySearchExample {
    public static void main(String[] args) {
        int[] nums={-5,23,123,654,12345,14421};
        int indexOne= Arrays.binarySearch(nums,23);
        System.out.println("indexOne = " + indexOne);
        //eger listede olmayan birsey yazarsan outprintte indexOne eksi bir rakam cikar.

        System.out.println(Arrays.binarySearch(nums,12345));

        System.out.println(Arrays.binarySearch(nums,8));

        if(Arrays.binarySearch(nums,23)>=0){
            System.out.println("23 is exit in the list");
        }else{
            System.out.println("23 i snot in the list");
        }
    }
}
