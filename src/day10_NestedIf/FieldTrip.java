package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade= 2;
        String location="";
        int groupNumber=0;
        String teacher="";

        if(grade>=1&&grade<=6){
            if(grade==1){
                location="Apple orchard";
                groupNumber=3;
                teacher="Ms.Smith";

            }else if(grade==2){
                location="Zoo";
                groupNumber=7;
                teacher="Mr. Lee";

            }else if(grade==3){
                location="Aquarium";
                groupNumber=5;
                teacher="Ms. Wilson";
            }


        }else{
            System.out.println("invalid Grade");

        }
        System.out.println("location="+ location);
        System.out.println("Group Number="+ groupNumber);
        System.out.println("Teacher Name="+ teacher);


    }
}
