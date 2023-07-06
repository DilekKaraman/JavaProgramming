package day17;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Would you like to reserve a room");
        int price=0;
        String ans=scan.nextLine().toLowerCase();
        if(ans.equals("no")) {
            System.out.println("Have a nice day.");
        }
            while(!(ans.equals("yes")||ans.equals("no"))){
                System.out.println("Invalid answer, please re-enter,would you like to reserve a room");
                ans=scan.nextLine().toLowerCase();
            }
        if(ans.equals("yes")){
            System.out.println("which type of room would you wants to reserve");
            String room=scan.nextLine().toLowerCase();
            if(room.equals("king bed")){
               price+=120;
            }else if(room.equals("queen bed")){
                price+=100;

            }else if(room.equals("single bed")){
                price+=80;
            }
            while(!(room.equals("king bed")||room.equals("queen bed")||room.equals("single"))){
                System.out.println("Invalid room, please re-select type of room");
                room=scan.nextLine().toLowerCase();
            }
        }
        System.out.println("Your room's price = $" + price);

scan.close();



        /*Create a class called RommReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry

         */
    }
}
