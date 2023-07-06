package day45_Abstraction;

public interface propertiesOfInterface {

    int a=100;// sabit deger verirsen olur static and final by default
    static  int b=200;// kullaniciya girdirmedik degeri tanimladik sabit.

/* interfacede construct kullanamazsin
    public propertiesOfInterface(int a) {
        this.a = a;
    }
    */
 /* interface de block kullanamazsin
    static {
        b=100;
    }
*/

    /*  instance method kullanamazsin
    public void method1(){

        System.out.println("Instance method");
    }
*/
    static void method2(){// basina public yazabilirsin ama gerek yok
        System.out.println("Static method");
    }

    void method3();// basina public abstract yazabilirsin ama gerek yok

    default void method4(){// basina public yazabilirsin
        System.out.println("Default method");
    }

    void drink();// abstract method oluyor onune birsey yazmazsak bu sekilde interfacede kullanabiliriz.

    class Test implements propertiesOfInterface{

        @Override
        public void method3() {

        }

        @Override
        public void drink() {

        }

    }

    public static void main(String[] args) {
        new Test().method4();
    }

}
