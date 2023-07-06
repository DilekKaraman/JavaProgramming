package day33;

public class DogTest {
    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", "Small", "White",'F', 4 );

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();


    }
}
