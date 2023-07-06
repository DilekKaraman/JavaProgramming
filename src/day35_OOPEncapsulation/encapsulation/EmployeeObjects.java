package day35_OOPEncapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Tatiana",'F',28,110000);

        employee1.setSalary(employee1.getSalary()+15000);
        System.out.println(employee1);

        Employee employee2=new Employee("",'Q',-28,-1000);
        employee2.setName("Elvira");
        System.out.println(employee2);
    }
}
