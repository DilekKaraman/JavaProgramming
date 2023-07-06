package day40_FinalKeyword;

public class FinalVariable {

final String birthday;
final static String name;

static{
    name="Batch 25";
}

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {
       final double pi=3.14;
       // pi=4.14;
       // pi=5.4;

        final String name;
        name="Java";
        //name="Wooden Sport";

        System.out.println(name);
        System.out.println("----------------------------------------");
        FinalVariable obj= new FinalVariable("May/01");
        System.out.println(obj.birthday);

        System.out.println("----------------------------------------");
//FinalVariable.name="Python";
        System.out.println(FinalVariable.name);
        System.out.println(name);
    }
}
