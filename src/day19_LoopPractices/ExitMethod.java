package day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {

            if(i==3){
               // break;//loopu durdur
                //continue; //o iterationi atla devam et
                System.exit(0);// programi durdur.
            }
            System.out.println(i);
        }
        System.out.println("Wooden Spoon");

    }
}
