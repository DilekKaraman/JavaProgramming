package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name= "John";
        int age= 38;
        String citizen= "USA";
        boolean isEligible= age>=21 && citizen=="USA";


        //Eligible
if(isEligible){
    System.out.println(name +" is eligible");
}

        //Not Eligible
if(!isEligible){
    System.out.println("not Eligible");
}
    }
}
