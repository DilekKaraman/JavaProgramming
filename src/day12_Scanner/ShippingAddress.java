package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName=input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber=input.next();
        input.nextLine();

        System.out.println("Enter your Street name:");
        String streetName=input.nextLine();

        System.out.println("Enter your city name:");
        String cityName= input.nextLine();


        System.out.println("Enter your state:");
        String state=input.next();

        System.out.println("Enter your zip code:" );
        String zipCode=input.next();

input.close();
        System.out.println(fullName + "\n"+buildingNumber+"\n"+streetName+"\n"+cityName+"\n"+state+"\n"+zipCode);


    }
}
