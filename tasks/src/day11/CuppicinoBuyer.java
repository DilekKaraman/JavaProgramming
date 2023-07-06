package day11;

import java.util.Scanner;

public class CuppicinoBuyer {
    public static void main(String[] args) {
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size please:");
        String size=scan.next();
       // boolean valid= size=="tall"||size=="grande"||size=="venti";
       // solution1:
        if(size.equals("tall")){
            System.out.println("price is $3.69"+ "\n90 calories");
        }else if(size.equals("grande")){
            System.out.println("price is $3.99"+ "\n120 calories");
        }else if(size.equals("venti")){
            System.out.println("price is $4.29"+ "\n150 calories");
        }else{
            System.out.println("Invalid Size");
scan.close();*/
       /* //solution2
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size please:");
        String size2 = input.next();
        switch (size2) {
            case "tall":
                System.out.println("price is $3.69" + "\n90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99" + "\n120 calories");
                break;
            case "vent":
                System.out.println("price is $4.29" + "\n150 calories");
                break;
            default:
                System.out.println("Invalid Size");
        }
    }
}*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size please:");
        String size3 = input.next();

        if(size3.equals("tall") || size3.equals("grande") || size3.equals("venti")){
            switch(size3){
                case "tall":
                    System.out.println("price is $3.69" + "\n90 calories");
                    break;
                case "grande":
                    System.out.println("price is $3.99" + "\n120 calories");
                    break;
                 default:
                    System.out.println("price is $4.29" + "\n150 calories");
            }
            }else {
            System.out.println("Invalid Size");
        }

            }
        }

        /*Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
         */

