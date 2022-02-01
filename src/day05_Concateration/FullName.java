package day05_Concateration;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary= 180_000.58;


        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old ");
        // Fullname is jobTitle, works at ComponyName, and FullName' salary is salary

        System.out.println(fullName +" is " + jobTitle + ", works at " +
                companyName + ", and " + fullName + "' salary is $"+ salary);


    }
}
