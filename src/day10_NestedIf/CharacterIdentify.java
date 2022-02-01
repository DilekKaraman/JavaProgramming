package day10_NestedIf;

public class CharacterIdentify {
    public static void main(String[] args) {

        char ch = 65;
        if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

            System.out.println("Alphabetic");

        } else {
            System.out.println("Special character");
        }
    }
}
