package day11;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        /*Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1
selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2
selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3
selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed*/
       //solution1:
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter floor number");
        int floorNumber=scan.nextInt();
        boolean valid=floorNumber==1||floorNumber==2||floorNumber==3;
        if(valid){
            if(floorNumber==1){
                System.out.println("Floor 1 \n" +
                        "selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floorNumber==2){
                System.out.println("Floor 2 \n" +
                        "selected. Companies: Cybertek, NASA, Intelsat");
            }else if(floorNumber==3) {
                System.out.println("Floor 3 \n" +
                        "selected. Companies: Lyft, BofA, Stake house");
            }
        }else {
            System.out.println("nvalid floor - 6");
        }
*/
        /*solution2
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter floor number");
        int floorNumber=scan.nextInt();
        switch(floorNumber){
            case 1:
                System.out.println("Floor 1 \n" +
                            "selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                    System.out.println("Floor 2 \n" +
                            "selected. Companies: Cybertek, NASA, Intelsat");
                    break;
            case 3:
                    System.out.println("Floor 3 \n" +
                            "selected. Companies: Lyft, BofA, Stake house");
                    break;
            default:
                System.out.println("nvalid floor - 6");
        }*/
        // solution3
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter floor number");
        int floorNumber=scan.nextInt();
        boolean valid=floorNumber==1||floorNumber==2||floorNumber==3;
        if(valid){
            switch(floorNumber){
                case 1:
                    System.out.println("Floor 1 \n" +
                        "selected. Companies: Lobby, Verizon, Starbucks");
                    break;
                case 2:
                System.out.println("Floor 2 \n" +
                        "selected. Companies: Cybertek, NASA, Intelsat");
                break;
                default:
                System.out.println("Floor 3 \n" +
                        "selected. Companies: Lyft, BofA, Stake house");
            }
        }else {
            System.out.println("nvalid floor - 6");
        }
    }
}
