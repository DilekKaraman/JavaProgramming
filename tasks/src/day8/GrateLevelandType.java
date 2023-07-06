package day8;

public class GrateLevelandType {
    public static void main(String[] args) {
       /* Given a number(byte) grade level determine and print which
        school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        Assume that the given number is 1 ~ 18
        */

        byte gradeLevel=5;
        if(gradeLevel==1 || gradeLevel<=5){
            System.out.println("Elementary school");
        }else if(gradeLevel>=6 || gradeLevel<=8){
            System.out.println("Middle school");
        }else if(gradeLevel>=9 || gradeLevel<=12) {
            System.out.println("High school");
        }else if(gradeLevel>=13 || gradeLevel<=16) {
            System.out.println("College school");
        }else if(gradeLevel==17 || gradeLevel==18) {
            System.out.println("Grad school");
        }
    }
}
