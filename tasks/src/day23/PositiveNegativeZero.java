package day23;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        positiveNegativeZero(8);
    }
    public static void positiveNegativeZero(int num){
        if(num==0){
            System.out.println("Zero");
        }else if(num>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
/*create a method that can if the given integer is positive,
negative or zero

 */