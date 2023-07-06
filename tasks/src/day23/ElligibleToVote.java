package day23;

public class ElligibleToVote {
    public static void main(String[] args) {
        elligibleToVote(15);
    }
    public static void elligibleToVote(int age){
        if(age>=19){
            System.out.println("You are eligible to vote.");
        }else{
            System.out.println("You are not eligible to vote!");
        }
    }
}
/*create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:You are not eligible to vote!


 */