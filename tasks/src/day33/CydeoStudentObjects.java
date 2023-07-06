package day33;

public class CydeoStudentObjects {
    public static void main(String[] args) {
CydeoStudent student1=new CydeoStudent("Dilek",36,'F',14,'B',16,25);

CydeoStudent student2=new CydeoStudent("Ummu",30,'F',14,'A',34,56);

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();



    }
}
