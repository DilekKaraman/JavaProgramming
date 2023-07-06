package day24_CustomMethods_Return;

public class Test {
    public static void main(String[] args) {

        String str="aaaaaaaaabbbbbbbbbbbbbbbbb";

        str=ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name="Java Programming";
        String reverseName= ReturnMethodIntro.reverse(name);
        System.out.println(reverseName);

    }
}
