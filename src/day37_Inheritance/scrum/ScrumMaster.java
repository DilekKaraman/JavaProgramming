package day37_Inheritance.scrum;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender,  int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Muster", id, salary, companyName);
    }

}
