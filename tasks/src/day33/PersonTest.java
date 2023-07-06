package day33;

public class PersonTest {
    public static void main(String[] args) {
Person person1=new Person("Jim",25,'M');
Person person2=new Person("Ali",30,'M');
        System.out.println(person1);
        System.out.println(person2);

        person1.eat("apple");
        person2.drink("water");
        person1.sleep();
        System.out.println(person1.numOfHead);

    }
}
