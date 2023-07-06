package day18;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Which bedroom do you wants to reserve");
            String roomType = scan.nextLine().toLowerCase();
            int totalPrice = 0;
            while(!(roomType.equals("king bed")||roomType.equals("queen bed")||roomType.equals("single bed"))){
                System.out.println("Invalid entry,please re-enter");
                roomType=scan.nextLine().toLowerCase();
            }
            if (roomType.equals("king bed")) {
                totalPrice += 120;
            } else if (roomType.equals("queen bed")) {
                totalPrice += 100;
            } else if (roomType.equals("single bed")) {
                totalPrice += 80;
            }
            System.out.println("How many nights will you stay");
            int dayNum = scan.nextInt();
scan.nextLine();
            System.out.println("Would you like to reserve another room?");
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))) {
                System.out.println("Invalid entry,please re-enter");
                a = scan.nextLine().toLowerCase();
            }
            if (a.equals("no")) {
                totalPrice *= dayNum;
                System.out.println("total price is: $" + totalPrice);
                break;
            }

        }
        /*
         Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
         */




    }
}
