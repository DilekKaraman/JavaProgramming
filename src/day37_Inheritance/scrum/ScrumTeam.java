package day37_Inheritance.scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

public ArrayList<Tester> testers=new ArrayList<>();
public ArrayList<Developper> developpers=new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }
    public void addTester(Tester tester){
    testers.add(tester);
}
public void addTester(Tester[] testers){
this.testers.addAll(Arrays.asList(testers));
}
public void removeTester(int id){
        testers.removeIf(p->p.id==id);
}
public void addDevelopper(Developper developper){
        developpers.add(developper);
}
public void addDeveloppers(Developper[] developpers){
        this.developpers.addAll(Arrays.asList((developpers)));
}
public void removeDevelopper(int id){
        developpers.removeIf(p->p.id==id);
}

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", number of testers=" + testers.size() +
                ", number of developpers=" + developpers.size() +
                '}';
    }
}
/*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)
            Methods:
                addTester(Tester tester): adds the given tester to testers arraylist
                ddTesters(Tester[] testers): adds the given testers to testers arraylist
                removeTester(int id): removes the tester with the given id from the arraylist of tester
                addDeveloper(Developer developer): adds the given developer to testers arraylist
                addDeveloper(Developer[] developer): adds the given developers to testers arraylist
                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */
