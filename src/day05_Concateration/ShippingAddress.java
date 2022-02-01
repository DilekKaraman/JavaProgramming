package day05_Concateration;

public class ShippingAddress {
    public static void main(String[] args) {

        String name= "James King",
                buildingNumber= "1123B",
                 streetName= "John Branch Dr",
                city= "Mclean",
                state= "VA",
                zipCode= "22031A";

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state + " " + zipCode );
    String address=name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state + " " + zipCode;
        System.out.println("address = " + address);

    }
}
