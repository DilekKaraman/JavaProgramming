package day23;

public class PrintEachChar {
    public static void main(String[] args) {
        printEachChar("Cydeo");
    }
    public static void printEachChar(String word){
        for (int i = 0; i <word.length() ; i++) {
            System.out.print(word.charAt(i)+" ");
        }
    }
}
/*create a method named printEachChar that can print each
characters of a string

 */