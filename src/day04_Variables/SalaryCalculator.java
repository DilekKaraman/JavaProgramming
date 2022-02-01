package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
// hourly Rate, weeklyHours
        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberofWeeks = 52;
        int salary = hourlyRate * weeklyHours * numberofWeeks;

        System.out.println(salary);
// if we put "" in --> system.out.println("salary"); we see only salary
        // if we wnt to calculte, we don't put ""

// if we want to put $
        System.out.println("salary = $" + salary);
        System.out.println("numberofWeeks = " + numberofWeeks);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
    }
}
