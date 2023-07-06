package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        //15 16 17 .....45
        for(int i=15;i<=45;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Hello");

        for(int a=100; a>=50;a--){
            System.out.print(a+" ");
            System.out.println();
            System.out.println("_____________________________________________");
            for(int b=2;b<=54;b++){// for(in b =2; b<=54; b+=2) better
                if(b%2==0){
                    System.out.print(b+" ");
                }
            }
            System.out.println();
            System.out.println("-------------------------------------------------");
            for(char i='A';i<='Z';i++){
                System.out.print(i+" ");
            }
            System.out.println();
            for (char m='a';m<='z';m++){
                System.out.print(m+" ");
            }
            System.out.println();
            System.out.println("-----------------------------------------------------");
            for(char n='Z'; n>='A';n--){
                System.out.print(n+" ");
            }
            System.out.println();
            for(char x='z';x>='a';x--){
                System.out.print(x+" ");

            }

        }
    }
}
