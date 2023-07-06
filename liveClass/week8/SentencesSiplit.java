package week8;

import java.util.Arrays;

public class SentencesSiplit {
    public static void main(String[] args) {


                String searchResult = "1-16 of 829 results for ipad";

                // in my test cases I want to verify that my search result comes over 500

                // split method turns your string into array

                String[] each = searchResult.split(" ");

                System.out.println(Arrays.toString(each));

                String searchAmount = each[2];

                System.out.println("searchAmount = " + searchAmount);

                // Break time task : capture the amount 790 with split method
                String confirmation = "Id: 2239677\n" +
                        "Amount: 790 USD\n"+
                        "Card Number: 8548595959595\n"+
                        "Name: oscar\n"+
                        "Date: 11/10/2021";

                System.out.println("confirmation = " + confirmation);
                String[] list=confirmation.split("\n");
        System.out.println(Arrays.toString(list));
String search=list[1];
        System.out.println("search = " + search);
        //String[] list=confirmation.split("\n")[1].split(" ").[1];

        int [] nums = {5 , 10 , 4, 1000, 35};

        // Arrays utility class created by Java developers and it has some useful methods that we can use

        Arrays.sort(nums);  // sorting your elements from smaller to larger

        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        int [] numsTwo = {4, 5 , 10, 35, 1000};

        int [] numsThree = nums; // creating a new refernce for the same the object

        // Arrays.equals()  is used to check if two arrays' contents are equal
        System.out.println("Arrays.equals(nums,numsTwo) = " + Arrays.equals(nums, numsTwo));

        System.out.println(nums == numsTwo); // false checking if the object is equal

        System.out.println(nums == numsThree); // true
        System.out.println(Arrays.equals(nums,numsThree)); // true

        nums[0]=5000;
        System.out.println(Arrays.toString(numsThree));

        // copy of method

        int [] numsFour = Arrays.copyOf(nums,nums.length);
        nums[0] = 3000;

        System.out.println(Arrays.toString(numsFour));

    }
}


