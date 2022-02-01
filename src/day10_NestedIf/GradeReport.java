package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score=90;

        if(score>=0 && score<=100){
            if(score>=90){
                System.out.println("A");
            }else if(score>=80){
                System.out.println("B");
            }else if(score>=70){
                System.out.println("C");
            }else if(score>=60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        } else{
            System.out.println("Invalid Score");
        }
        System.out.println("--------------------------------------");
        String result="";
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

    }


}
