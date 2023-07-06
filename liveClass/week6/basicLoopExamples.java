package week6;

public class basicLoopExamples {

    public static void main(String[] args) {

        /*
         write 0,10,20,30,40,50,60....1000
         int i: inotialization
         i<= condition
         i+=10 iteration
         */

        for (int i = 0; i <= 1000; i += 10) {
            System.out.print(i + " ");
        }
// initialization
        int z = 0;
        for (; z <= 1000; ) {
            if (z % 10 == 0) {
                System.out.print(z + " ");


            }
            z ++;
        }


int count=0;
        for (int a = 5; a <=50; a++) {
            if(a%2==0){

               count++;

            }

        }

        System.out.println(count);


    }

}