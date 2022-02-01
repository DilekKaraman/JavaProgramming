package scannerScan;


import java.util.Scanner;

public class ScannerDeneme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num");
        int num=input.nextInt();
        System.out.println("Enter num2");
        int num2=input.nextInt();
        System.out.println("Enter word");
        String word=input.next();
        input.nextLine();//Sonrasinda cumle yazabilmek icin enter demesi icin oncesinde de bunu yaziyoruz.

        System.out.println("Enter sentences");
        String sentences=input.nextLine();

    }
}
