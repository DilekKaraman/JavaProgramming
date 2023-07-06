package day8;

public class cigarette {
    public static void main(String[] args) {

        /* Given a number (byte) age, write a program that can check if the
        person is eligible to buy Cigarettes
         */
      byte age=18;
        if(age>=21){
            System.out.println("The person is eligible to buy Cigarettes");
        }else{
            System.out.println("The person is not eligible to buy Cigarettes");
        }
    }
}
