package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int s = 90;

       /*  String result="";
        if(score>=0 && score<=100){
            if(score>=90){
                result=" Excellent";
            }else if(score>=80){
                result=" Great";
            }else if(score>=70){
                result=" Good";
            }else if(score>=60){
                result=" Passed";
            }else{
                result=" Failed";
            }
        } else{
            result="Invalid Score";
        }

        System.out.println(result);

        */
        String result = (s >= 0 && s <= 100) ? (s >= 90)? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                :(s>=60)?"Pass":"Failed":"Invalid Score";
        System.out.println(result);

        System.out.println("-------------------------------------------------");

        String result1="";
        if(s>=0 &&s<=100){
           result1= (s >= 90)? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                    :(s>=60)?"Pass":"Failed";
        }else{
            result1="Failed";
        }
        System.out.println(result1);

    }
}