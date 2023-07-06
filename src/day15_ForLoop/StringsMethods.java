package day15_ForLoop;

public class StringsMethods {
    public static void main(String[] args) {
       String result="     ";
       boolean r=result.isEmpty();
        System.out.println(r);

        boolean r1=result.isBlank();
        System.out.println(r1);
String result2="Cydeo          ";
        System.out.println(result2.isBlank());

        System.out.println("-----------------------------------------------");
        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        //YES,YEs,yes,yEs....
        System.out.println("yEs".equals("YES"));
        System.out.println("YES".equalsIgnoreCase("yes"));

        System.out.println("-----------------------------------------------");

        String sentence=" My favourite promming language is Java";
        boolean hasCSharp=sentence.contains("C#");
        boolean hasJava=sentence.contains("Java");
        System.out.println(hasCSharp);
        System.out.println(hasJava);
boolean hasJava3=sentence.toLowerCase().contains("java");
        System.out.println(hasJava3);

        System.out.println("-------------------------------------------");

        String input1="I love Java";
        String input2= "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains("Java"));
        System.out.println(input1);
        System.out.println("-----------------------------------------------------");
        String a="Wooden Spoon";
        boolean x= a.startsWith("oo");
        System.out.println(x);
        boolean y= a.endsWith("Spoon");
        boolean z= a.toLowerCase().startsWith("wooden");
        System.out.println(y);
        System.out.println(z);




    }
}
