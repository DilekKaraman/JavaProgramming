package day20_Arrays;

public class MinNumberofArray {

    public static void main(String[] args) {

        int[] numbers={10,4,6,56,43,1};
        int min=numbers[0];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
    }
}
