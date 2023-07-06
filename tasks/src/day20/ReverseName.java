package day20;

public class ReverseName {
    public static void main(String[] args) {
        String[] names={"Dilek", "Eda", "Semra","Tugba", "Yusuf", "Oscar", "Sally",
                "Tolganay", "Muhtar", "Asya"};

        for (int i = 0; i <names.length ; i++) {
String word=names[i];
            String reverse= "";
            for (int j =word.length()-1; j >=0; j--) {
                reverse += word.charAt(j);
            }
            System.out.println(reverse);
        }


        /*?create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c

         */
    }
}
