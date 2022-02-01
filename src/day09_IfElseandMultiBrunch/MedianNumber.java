package day09_IfElseandMultiBrunch;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        boolean bIsMedian= (a<b && b<c)||(c<b && b<a);
        boolean aIsMedian= (b<a && a<c)||(c<a && a<b);
        boolean cIsMedian= !bIsMedian && !aIsMedian;


        if(bIsMedian){
            System.out.println(b + " is medium number");
        }
        if(aIsMedian){
            System.out.println(a + " is medium number");
        }
        if(cIsMedian){
            System.out.println(c + " is medium number");
        }
    }
}
