package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
// age: 38 years old
        byte age = 38;
//weight: 160 pounds // 160 is out of the byte' range
        short weihgt = 160; // 160 is with in short' range
        // salary 100000 $
        // 100000 is out of the short' range so we should use int
        // $ we have not learnt that how it put yet
        int salary = 100000;
        // asset: 3_333_333_333
        // if you want to write bigger 2 million you can use long. Becuse it is with in long' range.
        // when you use long, you have to put l or L end of code.otherwise it will be err.

        long asset =3_333_333_333l;
         // if you want to show easy readable number you can not to use (,) semicolon. you have to use underscore(_)

        // if you write decimel number you have to use float or double. for short range float, long range double.
        //if you use float you have to put F or f end of code. Otherwise it will be err.

        // tax: 0.26
        float tax = 0.26f;

        double PI= 3.14;

        /* char--> is a single character. there is a char table. every character has one number. max 65155 e kadar.
        if you write either character or number when you do run you can see only character.
         */

char ch1= '*';
        System.out.println("ch1 = " + ch1);

        char ch2= 35;
        System.out.println("ch2 = " + ch2);

// boolean= only either true or false
        boolean isMarried= true;
        boolean isResult= 100>300;
        boolean isEmployed= true;

        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isResult = " + isResult);

        String name= "Wooden Spoon";




    }
}
