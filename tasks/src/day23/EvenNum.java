package day23;

public class EvenNum {
    public static void main(String[] args) {
        
        evenNum();
    }
    public static void evenNum(){
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
/*create a method that can print even numbers between 1~100 in a
same line saperated by space

 */