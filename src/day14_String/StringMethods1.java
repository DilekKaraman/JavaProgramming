package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1="       batch 25           ";
        str1=str1.trim();//"batch 25"

        System.out.println(str1);

        String str2="Cydeo School";

        int n1=str2.indexOf("h");//8
        System.out.println("n1="+n1);

        int n2=str2.indexOf("o");//4
        System.out.println("n2:"+n2);

        int n3=str2.indexOf("ool");//9
        System.out.println("n3:"+n3);

        String str3="Java Programming Language";
        int n4=str3.indexOf("a");
        System.out.println("n4="+n4);

        int n5=str3.indexOf("an");
        System.out.println("n5:"+n5);
        int n6=str3.lastIndexOf("g");
        System.out.println("n6="+n6);

        String s= "Java Nova Cava Wawa orange";

int fourthA=s.indexOf("Ca")+1;
int fifthA= s.lastIndexOf("va")+1;

        System.out.println("forthA:"+fourthA);
        System.out.println("fifthA:"+fifthA);



    }
}
