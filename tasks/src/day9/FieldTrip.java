package day9;

public class FieldTrip {
    public static void main(String[] args) {
        /*Create a class called FieldTrip. Your school goes on a Field trip each
year. The place you go will be based on your grade. Given a variable
gradeNumber (1-6) figure out the details of your field trip. Print the
information at the end.
Data based on grade:
grade - 1
location -  Apple orchard
number of groups - 3
teacher in charge - Ms. Smith
grade - 2
location - Zoo
number of groups - 7
teacher in charge - Mr. Lee
grade - 3
location - Aquarium
number of groups - 5
teacher in charge - Ms. Wilson
grade - 4
location - Movie theater
number of groups - 2
teacher in charge - Ms. Reyes
grade - 5
location - Museum
number of groups - 5
teacher in charge - Ms. Lela
grade - 6
location - Six Flags
number of groups - 8
teacher in charge - Mr. Watt
         */
        int gradeNumber=4;
        if(gradeNumber==1){
            System.out.println("location -  Apple orchard" +
                    "\nnumber of groups - 3" +
                    "\nteacher in charge - Ms. Smith");
        }else if(gradeNumber==2){
            System.out.println("location - Zoo\n" +
                    "number of groups - 7\n" +
                    "teacher in charge - Mr. Lee");
        }else if(gradeNumber==3){
            System.out.println("location - Aquarium\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Wilson");
        }else if(gradeNumber==4){
            System.out.println("location - Movie theater\n" +
                    "number of groups - 2\n" +
                    "teacher in charge - Ms. Reyes");
        }else if(gradeNumber==5){
            System.out.println("location - Museum\n" +
                    "number of groups - 5\n" +
                    "teacher in charge - Ms. Lela");
        }else if(gradeNumber==6){
            System.out.println("location - Six Flags\n" +
                    "number of groups - 8\n" +
                    "teacher in charge - Mr. Watt");
        }
    }
}
