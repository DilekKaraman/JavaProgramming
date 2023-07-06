package day23_CustomMethods;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        evenNum();
    }
    // create a function that can print hello world 5 times==> helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 1; i <6 ; i++) {
            System.out.println("Hello World!");
        }

    }

    //create a function that can print hello cydeo 5 times
public static void helloCydeo5Times() {
    for (int j = 0; j < 5; j++) {
        System.out.println("Hello Cydeo1");
    }
}
// create a function that can print all the even num between 1~10
public static void evenNum(){
    for (int i = 2; i < 11; i+=2) {
        System.out.println(i);
    }
    }



}
