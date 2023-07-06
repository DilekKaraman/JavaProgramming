package day33_Statics;

import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {
        Students student1 = new Students("Ahmet");
        Students student2 = new Students("Aysun", 'F');
        Students student3 = new Students("Nigara", 11);
        Students student4 = new Students("Mert",12, 'M');
        Students student5 = new Students("Cihad" ,'M' ,28);
        Students student6=new Students("Shuaib",'M',27,15);
        Students student7=new Students("Ali",'M',42,30,'A');


        System.out.println(student2);
        System.out.println(student1==student2);
Students[] students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));
    }
}
