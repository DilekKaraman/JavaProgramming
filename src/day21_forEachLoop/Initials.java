package day21_forEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names={"Cydeo School", "wooden Spoon", "Java Programming","SQL Programming","Selenium Automation",
        "API Testing", "Database Testing","Manuel Testing"};

        for(String each:names){
            String initial=each.charAt(0)+ "."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }


    }
}
