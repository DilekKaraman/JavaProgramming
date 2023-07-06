package day35_OOPEncapsulation;

public class Person {
public String name,language;
public int age;
public char gender;

public static String planet;
public static boolean isHuman;
public static boolean isNose;
public static int numberOfWings;
public static int numberOfHead;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
    static{
        planet="Eart";
        isHuman=true;
        isNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }
    public static void printPlanetName(){
        System.out.println("Planet Name: "+planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating "+ food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet='" + planet + '\''+
                '}';
    }

    /*Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
     */
}
