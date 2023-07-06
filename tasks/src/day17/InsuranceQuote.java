package day17;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=scan.nextLine();
        System.out.println("Enter your gender");
        String gender=scan.next().toLowerCase();
        while(!(gender.equals("male")||gender.equals("female"))){
            System.out.println("Invalid entry please re-enter valid entry");
        }
        System.out.println("Are you married?");
        String married=scan.next().toLowerCase();

        while(!(married.equals("yes")||married.equals("no"))) {
            System.out.println("Invalid entry, please re-enter valid entry");
            married = scan.next().toLowerCase();
        }
        System.out.println("Enter your age:");
        int age=scan.nextInt();

        while(age<0||age>120){
            System.out.println("Invalid entry, please re-enter valid entry");
            age=scan.nextInt();
        }
        System.out.println("Enter how many miles he/she drives in a day");
        int miles=scan.nextInt();

        while(miles<5){
            System.out.println("Invalid entry, please re-enter valid entry");
            miles=scan.nextInt();
        }
        scan.nextLine();
        System.out.println(" do you want full coverage or liability insurance?");
String insuranceType=scan.next().toLowerCase();

        System.out.println("Do you have any accidents or claims in past 5 years? ");
        String accident=scan.next().toLowerCase();

        while(!(accident.equals("yes")||accident.equals("no"))) {
            System.out.println("Invalid entry, please re-enter valid entry");
            accident = scan.next().toLowerCase();
        }
        System.out.println(" Has your car got an anti-theft device (Yes/No)");
        String anti=scan.next().toLowerCase();

        while(!(anti.equals("yes")||anti.equals("no"))) {
            System.out.println("Invalid entry, please re-enter valid entry");
         anti = scan.next().toLowerCase();
        }
        double calculation=0;
        if(insuranceType.equals("full")){
            if(age < 25){
                calculation+=160;
            }else if(age>25){
                calculation+=120;
            }
            if(miles<=10){
                calculation+=20;
            }else if(miles>10&&miles<=50){
                calculation+=40;
            }else if(miles>50){
                calculation+=70;
            }
        }else{
            if(age<25){
                calculation+=90;
            }else if(age>=25){
                calculation+=50;
            }
            if(miles<=10){
                calculation+=10;
            }else if(miles>10&&miles<=50){
                calculation+=30;
            }else if(miles>50){
                calculation+=50;
            }
        }
        double discount=1;
        if(anti.equals("yes")){
            discount*=0.95;
        }
        if(married.equals("yes")){
            discount*=0.95;
        }
        if(accident.equals("yes")){
            discount*=1.15;
        }else{
            discount*=0.90;
        }
        double total=calculation*discount;
        System.out.println("total = " + total);

        /*Create a class called InsuranceQuote, write a program that can
calculate the insurance cost of a person based on the following info:
1. Ask the user to enter your name
2. Ask the user to enter your gender
(if user enters invalid entry, ask the user
to re-enter until user provides a valid entry)
3. Ask the user if he/she is married(Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
4. Ask user to enter your age
(age can not be negative or
greater than 120)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
5. Ask user to enter how many miles he/she
drives in a day
(mileage can not be negative
or less than 5)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
6. Ask the user if he/she wants full coverage
or liability insurance?
7. Ask if he/she had any accidents or claims
in past 5 years (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
8. Ask the user if his/her car has an anti-
theft device (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
Calculate the price of the insurance and display all the
info of the user
Insurance Quote calculation:
starting prices for liability:
age < 25 ===> 90
age >= 25 ==> 50
miles <= 10 ====> $10
    miles > 10 and miles <= 50 ==>
$30
    miles > 50 ===>  $50
starting prices for full coverage:
age < 25 ===> 160
age >= 25 ==> 120
miles <= 10 ====> $20
    miles > 10 and miles <= 50 ==>
$40
    miles > 50 ===>  $70
    If the car has anti-theft device ==> 5%
discount
    If he/she had any accidents or claims in
past 5 years ===> 15% extra charge
    If he/she never had any accidents or
claims in past 5 years ==> 10% discount
if she/he is married ==>5% discount
         */
    }
}
