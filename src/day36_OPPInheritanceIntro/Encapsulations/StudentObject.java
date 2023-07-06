package day36_OPPInheritanceIntro.Encapsulations;

import day36_OPPInheritanceIntro.Encapsulations.Student;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Hulya",25,'F','D',"Cydeo");
        student1.setAge(39);
        System.out.println(student1);
        Student student2=new Student("Kory",95,'M','Z',"Cydeo");
        System.out.println(student2);
    }
}
