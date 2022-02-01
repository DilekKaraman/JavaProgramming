package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
// >,>=,<,<=
        boolean result= 200>40;
        System.out.println("result = " + result);
boolean result2=300>=150;
        System.out.println("result2 = " + result2);
boolean result3= 300>=300;
        System.out.println("result3 = " + result3);

        boolean result4= 300>=500;
        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore =745;
        boolean isElligibleForLoan= creditScore>=720;
        System.out.println("isElligibleForLoan = " + isElligibleForLoan);

        System.out.println("-----------------------------------");
        int x=20;
        int y = 30;
        boolean egual= x==y;
        System.out.println("egual = " + egual);
        boolean result8= "Muhtar"=="good guy";
        System.out.println("result8 = " + result8);
        boolean result9= 'A'=='a';
        System.out.println("result9 = " + result9);

        System.out.println("-----------------------------------");
boolean result10= 100!=200;
        System.out.println("result10 = " + result10);
        boolean result11= "Java"!="Break";
        System.out.println("result11 = " + result11);

        boolean result12=300!=300;
        System.out.println("result12 = " + result12);

    }
}
