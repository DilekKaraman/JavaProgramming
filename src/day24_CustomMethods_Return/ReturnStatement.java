package day24_CustomMethods_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(7);


    }

        //4. create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        if(number<1|| number>7){
            System.out.println("Invalid");
            return;
        }else{
            String day="";
            day=(number==1)?"Monday":(number==2)?"Tuesdsy":(number==3)?"Wed":(number==4)?"Thur":(number==5)?"Fri":
                    (number==6)?"Saturday":"Sunday";
            System.out.println(day);
        }
    }






}
