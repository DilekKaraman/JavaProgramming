package day10_NestedIf;

import java.sql.SQLOutput;

public class NameOfMonth {
    public static void main(String[] args) {
        int num=15;
String result="";
        if(num>=1 && num<=12){
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
        } else {
        result="Invalid";
        }
        System.out.println(result);
    }
}
