package day08_IfStatements;

public class GradeReport { public static void main(String[] args) {
        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a;
//boolean b= score>=80 && score<=89;
        boolean c = score >= 70 && score <= 79;
// boolean c= !a && !b && score >=70;
        boolean d = score >= 60 && score <= 69;
        //boolean = !a&&!b&&!c&& score>=60;
        boolean f = score >= 0 && score <= 59;
        // boolean f= !a && !b && !c && !d;

if(a) {
    System.out.println(" Excellent");
}
if(b) {
    System.out.println(" Great");
}
if(c) {
    System.out.println(" Good");
}
if(d) {

    System.out.println(" Passed");
}
if(f) {
    System.out.println(" Failed");
}
    }
}
/*
score:
90-100==>Excellent
80-89==> Great
70-79==> Good
60-69==> Passed
0-59==> Failed
 */