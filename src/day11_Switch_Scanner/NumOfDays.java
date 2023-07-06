package day11_Switch_Scanner;

public class NumOfDays {
    public static void main(String[] args) {
       int number= 9;
       int year=2000;

       String result="";

       switch(number){
           case 2:
               if(year%4==0){
                   System.out.println("29Days");//result=(year%4==0)?"29 Days":"28 Days"; diyede yazabilirsin

               }else{
                   System.out.println("28 Days");
               }
               break;
               case 1:case 3:case 5:case 7:case 8:case 10:case 12:
               result="31 Days";
               break;

               case 4:case 6:case 9:case 11:
               result="30 Days";
               break;

           default:
               result="Invalid";

       }
        System.out.println(result);




    }
}
/*
numberofDays
28 Days:2
30 Days:4,6,9,11
31 Days: 1,3,5,7,8,10,12
 */