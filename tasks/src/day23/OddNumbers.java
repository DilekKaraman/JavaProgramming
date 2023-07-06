package day23;

public class OddNumbers {
    public static void main(String[] args) {

        oddnum();

    }
    public static void oddnum(){
        for (int num = 1; num <=100 ; num++) {
            if(num%2==1){
                System.out.print(num+" ");
            }

        }
    }

}
/*create a method that can print odd numbers between 1~100 in a
same line saperated by space

 */