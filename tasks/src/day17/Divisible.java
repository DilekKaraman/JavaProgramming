package day17;


public class Divisible {
    public static void main(String[] args) {

        int n=100;
        String DivisibelBy15="";
     String DivisibelBy5="";
        String DivisibelBy3="";
        for (int i = 0; i <n ; i++) {
           if(i%15==0){
               DivisibelBy15 +=i+ " ";
           }else if(i%5==0&& i%15!=0){
               DivisibelBy5 +=i+" ";
           }else if(i%3==0&& i%15!=0){
               DivisibelBy3 +=i+ " ";
           }

        }

        System.out.println("DivisibelBy3 = " + DivisibelBy3);
        System.out.println("DivisibelBy5 = " + DivisibelBy5);
        System.out.println("DivisibelBy15 = " + DivisibelBy15);
    }
}
