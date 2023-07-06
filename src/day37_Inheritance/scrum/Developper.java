package day37_Inheritance.scrum;

public class Developper extends Employee {


    public Developper(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+"is crying");
    }
}
