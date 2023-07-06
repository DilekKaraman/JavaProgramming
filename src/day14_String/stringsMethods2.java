package day14_String;

public class stringsMethods2 {
    public static void main(String[] args) {
      String str="Java is fun,I love learning Java";
      String str2=str.replace("Java","Python");//"python is fun,I love learning Python"
        System.out.println("str = " + str);
        System.out.println("str2="+str2);

        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo","gmail");

        System.out.println("email = " + email);

String sentences="Java Java Python Python C# C# C++ C++ Python Python Python Python";
String sentences2=sentences.replace("Python","").replace("  ","");
        System.out.println("sentences2 = " + sentences2);

String s="Dog Dog Dog Dog Dog Dog";
s= s.replace("Dog","Cat");
        System.out.println("s = " + s);
        String s2="C# is fun, C# is cool";
        s2=s2.replace(" C#"," Java");
        System.out.println("s2 = " + s2);
        String s3= "Java";
        s3=s3.replace("a","e");//Jeve
        System.out.println("---------------------------------------------");
        String result= "Java Java Java";
        result=result.replaceFirst("Java","Python");
        System.out.println(result);

        String result2="C# is fun, C# is cool";
        result2=result2.replaceFirst("C#","Java");
        System.out.println(result2);
String result3="Java";
result3=result3.replaceFirst("va","o");//Jao cunku va yi kalip olarak alir.
        System.out.println(result3);


    }
}
