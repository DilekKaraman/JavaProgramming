package day08_IfStatements;

public class SalaryCalculater {
    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;
        int salaryBeforeTax= hourlyRate *weeklyHours*52;
        double stateTax= salaryBeforeTax * stateTaxRate/100;
        double federalTax=salaryBeforeTax * federalTaxRate/100;
        double totalTax= stateTax + federalTax;
        double salaryAfterTax= salaryBeforeTax-totalTax;
        System.out.println("Gross pay is $"+ salaryBeforeTax);
        System.out.println("Stata Tax= $"+stateTax);
        System.out.println("Federal Tax= $" + federalTax);
        System.out.println("Total Tax= $"+totalTax);
        System.out.println("Net Income=$ "+ salaryAfterTax);
        System.out.println("Monthly Income= $ "+salaryAfterTax /12);





   /*
   salaryBeforeTax
   stateTax
   federalTaxRate
   totalTax
     salaryAfterTax
     Hint: SalaryBeforeTax= hourlyRate*weeklyhour*52
    */
    }
}
