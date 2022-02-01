package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
int num=5;

        String result="";

        if(num==1){
            result="January";
        }else if(num==2){
            result="February";
        }else if(num==3){
            result="March";
        }else if(num==4) {
            result="April";
        }else if(num==5) {
            result="May";
        }else  if(num==6) {
            result="June";
        }else if(num==7) {
            result="July";
        }else if(num==8) {
            result="Agust";
        }else if(num==9) {
            result="September";
        }else if(num==10) {
            result="October";
        }else if(num==11) {
            result="Novomber";
        }else if(num==12) {
            result = "December";
        }
        System.out.println("--------------------------------------------------");

        int n=4;
        String return2= (n==1)?"January":(n==2)?"February":(n==3)?"March":(n==4)?"April":(n==5)?"May":(n==6)?"June":
                (n==7)?"July":(n==8)?"Agust":(n==9)?"September":(n==10)?"October":(n==11)?"November":(n==12)?"December":"Invalid";
        System.out.println(return2);

    }
    }

