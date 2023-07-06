package day36_OPPInheritanceIntro.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("Max", "Husky", 'M',"Small",3,"White");

        dog.eat();
        dog.drink();
        dog.move();
        dog.sleep();
        dog.bark();

        System.out.println(dog);

        Cat cat=new Cat();
cat.setInfo("Tarcin","British",'M',"Small",3,"Brown");
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        cat.meow();;
        cat.scratch();
        System.out.println(cat);
        Tiger tiger=new Tiger();
tiger.setInfo("Sher Khan","Bengal",'M',"large",4,"Orange");
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);
    }
}
