package day23;

public class CalculateGrade {
    public static void main(String[] args) {
grade(80);
    }

    public static void grade(int score) {
        String grade = "";
        if (score >= 0 && score <= 100) {
            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            System.out.println("grade = " + grade);
        } else {
            System.out.println("Invalid");
        }

    }
}
/*5. create a method that can calculate the grade of the student based
on the score

 */