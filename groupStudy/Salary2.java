import java.util.Scanner;

public class Salary2 {
    public static void main(String[] args) {
        double baseSalary;
        int weekendHour ;
        int weekDayHour ;

        Scanner scan= new Scanner (System.in);
        System.out.println("Base salary");
        baseSalary= scan.nextDouble();
        System.out.println("weekday hours");
        weekDayHour= scan.nextInt();
        System.out.println("weekend hours");
        weekendHour= scan.nextInt();

        double hourlyRate= baseSalary/40;
        double weekDayExtra= ((weekDayHour-40)*1.5*hourlyRate);



        if(weekDayHour<40){
            baseSalary= baseSalary- (40-weekDayHour)*hourlyRate;}

        if(weekDayHour>=40 && weekendHour>=10) {
            baseSalary = baseSalary + weekDayExtra+ (weekendHour*2*hourlyRate) +500;
        }
        if(weekDayHour>=40 && weekendHour<10)
        { baseSalary = baseSalary + weekDayExtra+ (weekendHour*2*hourlyRate); }


        System.out.println("baseSalary = " + baseSalary);





    }

}
