package day17_While_DoWhile;

public class FrequencyOfWord_whileLoop {
    public static void main(String[] args) {
        String str="Java Java Phyton Python";
        int frequency=0;
        while(str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println("___________________________________________________");
String sentence=" cat cat cat cat cat cat cat cat dog dog dog cat cat";
sentence=sentence.toLowerCase();
int countcat=0;
while(sentence.contains("cat")){
    sentence=sentence.replaceFirst("cat","");
    countcat++;

}
        System.out.println(countcat);
        System.out.println("------------------------------------------");
        String s="Java Java java python python";
        s=s.toLowerCase();
        int java=0;
        int python=0;
        while(s.contains("java")||s.contains("python")){
            if(s.contains("java")){
                s=s.replaceFirst("java","");

                java++;
            }
            if(s.contains("python")){
                s=s.replaceFirst("python","");
                python++;
            }

        }
        System.out.println("java = " + java);
        System.out.println("python = " + python);
    }
}
