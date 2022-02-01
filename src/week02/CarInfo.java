package week02;

public class CarInfo {
    public static void main(String[] args) {
        int year=2022;
        String make="Audi";
        String model= "A6";
        // automatic= true, manuel= false;

        boolean transmission= true;
        String color= " black";
        int milage= 0;
        int price= 100_000; // euro

        System.out.println(year + " " + make + " " + model + " " + "\nAutomatic Transmission:"+ transmission);
        System.out.println(color + "|"+ milage + "kilometers|"+price+"Euros");

        // lets turn this value into TL 1 Euro+ 15.5 TL
        double princeInTL= price * 15.5;
        double taxRate = 1.80;
        double priceAfterTaxInTL= princeInTL* taxRate;
        System.out.println("priceAfterTaxInTL= "+priceAfterTaxInTL );

    }
}
