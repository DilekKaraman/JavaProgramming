package day21_forEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60,70};
        // index        0  1  2  3  4  5  6

        for (int i = 0; i < numbers.length; i++) {
            int eachElement=numbers[i];
            System.out.println(eachElement);


        }
        System.out.println("-------------------------------------");

        for(int each:numbers){
            System.out.println(each);
        }

    }
}
