package day23;

public class EachElement {
    public static void main(String[] args) {
        printEachElement(new int[] {1,2,3});

    }
    public static void printEachElement(int[] arr){
        for (int each : arr) {
            System.out.println(each);

        }
    }
}
/*create a method named printEachElement that can print each
elements of an integer array

 */