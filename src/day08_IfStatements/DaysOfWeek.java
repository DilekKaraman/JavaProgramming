package day08_IfStatements;

public class DaysOfWeek {
    public static void main(String[] args) {
        int day=3;
        boolean num1=day==1,
                num2=day==2,
                num3=day==3,
               num4= day==4,
                num5=day==5,
               num6= day==6,
                num7=day==7;
        if(num1) {
            System.out.println("Monday");
        }
        if(num2) {
            System.out.println("Tuesday");
        }
        if(num3) {
            System.out.println("Wednesday");
        }
        if(num4) {
            System.out.println("Thursday");
        }
        if(num5) {
            System.out.println("Friday");
        }
        if(num6) {
            System.out.println("Saturday");
        }
        if(num7) {
            System.out.println("Sunday");
        }

    }
}
