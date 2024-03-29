package day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        // the method demands additional info to complete its task

        oddOrEven(10);
        ageOfPerson(1995);
        printNumbers(1000, 2000);
    }

    //create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear) {
        int age = 2021 - birthYear;
        System.out.println(age);
    }

    // create a function that can display all the numbers between X and Y
    public static void printNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {


            System.out.print(i + " ");
        }
    }
}