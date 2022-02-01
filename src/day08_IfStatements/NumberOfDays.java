package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {

        int number=5;
        boolean has28days= number==2;
        boolean has31days= number==1 ||number==3||number==5||number==7||number==8||number==10||number==12;
        boolean has30days= !has28days &&!has31days;
        if(has28days){
            System.out.println("28 days");
        }
        if(has31days){
            System.out.println("31 days");
        }
        if(has30days){
            System.out.println("30 days");






        }
    }
}
