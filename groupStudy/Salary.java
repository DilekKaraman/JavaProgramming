import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter base salary: £");
        int baseSalary = scan.nextInt();
        System.out.println("Enter weekday Hours:");
        int weekdayHours = scan.nextInt();
        System.out.println("Enter weekend Hours:");
        int weekendHours = scan.nextInt();
        int weeklyhours = weekdayHours + weekendHours;
        double hourlyRate = 1000 / 40;


        double salary;
        if (weeklyhours<=40) {
            salary =  hourlyRate *weeklyhours;
            System.out.println("Employee's Salary= £"+ salary);
        } else if (weeklyhours >40 && weekendHours<10) {
            if(weekdayHours<40){
                salary =  baseSalary + hourlyRate*(weeklyhours-40)*2;
                System.out.println("Employee's Salary= £"+ salary);
            }else {
                salary=baseSalary+ hourlyRate*1.5*(weekdayHours-40)+hourlyRate*weekendHours*2;
                System.out.println("Employee's Salary= £"+ salary);
            }

        }else if (weeklyhours>40 && weekendHours>=10){
            if(weekdayHours<40){
                salary =  baseSalary + hourlyRate *2*(weeklyhours-40)+500;
                System.out.println("Employee's Salary= £"+ salary);
            }else {
                salary=baseSalary+ hourlyRate*1.5*(weekdayHours-40)+hourlyRate *2*(weekendHours)+500;
                System.out.println("Employee's Salary= £"+ salary);

            }

        }


    }
}

/*
We expect you to develop a weekly salary calculation program. We ask the user to get the base salary information,
the total hours worked during the week and the total hours worked on the weekend. Here are some rules;
•    Base salary must be at least 1000 euros.
•    The weekly working hour standard is 40 hours per week.
•    If the employee has worked less than 40 hours, her/his salary should be reduced proportionally
•    For every hour worked on weekdays over 40 hours, 1.5 times the hourly unit wage is paid.
•    For every hour worked on weekends over 40 hours, 2 times the hourly unit wage is paid.
•    If the employee has worked at least 40 hours during the week and at least 10 hours on the weekend,
he or she will receive an additional bonus of $500.
•
At the end of the program, we need to print the employee's salary to the console as output.
 */








       /* public class ProSalary {
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
    }
}
*/