package day15_ForLoop;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName="cyDEo",
                lastName="SCHOOL";

        firstName=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName=lastName.charAt(0)+lastName.substring(1).toLowerCase();
        System.out.println(firstName +" "+ lastName);
    }
}
