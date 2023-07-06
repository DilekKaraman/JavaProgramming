package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        // long number=9l;
        // float number= 9F;
        // double number = 9d;
        //boolean number= true;
        // these 4 variable not use in switch statement


        int number=5;

        /*
        if(number==1){
            System.out.println("Monday");

        }

         */

    switch(number){ //1,2,3,4,5,6,7 ==

        case 1:
            System.out.println("Monday");
            break;// exists the switch after executing the case block
        case 2:
            System.out.println("Tuesday");
            break;// exists the switch after executing the case block
            case 3:
            System.out.println("Wednesday");
            break;// exists the switch after executing the case block
        case 4:
            System.out.println("Thursday");
            break;// exists the switch after executing the case block
        case 5:
            System.out.println("Friday");
            break;// exists the switch after executing the case block
        case 6:
            System.out.println("Saturday");
            break;// exists the switch after executing the case block
        case 7:
            System.out.println("Sunday");
            break;// exists the switch after executing the case block

        default:
            System.out.println("Invalid Value");
            break;

}
    }
}
