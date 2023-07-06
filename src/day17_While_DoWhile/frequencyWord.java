package day17_While_DoWhile;

public class frequencyWord {
    public static void main(String[] args) {
        String sentence="JavaJavaJava";
        int count=0;
        String word="Java";
        for (int i = 0; i <sentence.length()-3 ; i++) {// length()-3 yazdik cunku asagida +4 yazinca son indexi gecmesin diye
            String eachSub=sentence.substring(i,i+4);
            if(eachSub.equalsIgnoreCase("java")){
                count++;

            }

        }
        System.out.println(count);
    }
}
