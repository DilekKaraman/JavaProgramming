package day35_OOPEncapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

public String getName(){

    return name;
}
public void setName(String name){
    this.name=name;
}
public int getage(){
    return age;
}

public void setAge(int age){
    if(age<=0){
        System.err.println("Invalid age: "+age);
        System.exit(0);
    }
    if(age>=150){
        System.err.println("Invalid age: "+age);
        System.exit(0);
    }
    this.age=age;
}

}
