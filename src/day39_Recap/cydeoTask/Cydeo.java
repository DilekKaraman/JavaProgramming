package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developper developper = new Developper("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester=new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developper);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println("------------------------------------------------------------------------");

        developper.setAge(39);
        System.out.println(developper.getAge());
        System.out.println(developper);
        System.out.println("------------------------------------------------------------------------");

        developper.work();
        tester.work();
        teacher.work();
        //student.work();
        System.out.println("------------------------------------------------------------------------");
developper.eat();
developper.drink();
developper.sleep();

developper.fixingBugs();
        System.out.println("------------------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        //tester.fixingBugs();
        tester.createTicket();
        System.out.println("------------------------------------------------------------------------");
teacher.eat();
teacher.drink();
teacher.sleep();

//teacher.fixingBug();
//teacher.createTicket();
        System.out.println("------------------------------------------------------------------------");
      student.eat();
      student.drink();
      student.sleep();

        //student.fixingBug();
//student.createTicket();
student.study();





    }
}