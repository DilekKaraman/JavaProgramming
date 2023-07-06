package day34_GarbageCollection_AccessModifiers;

import java.awt.image.PackedColorModel;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData); we can not use not reachable same package.

AccessModifiers.method1();
AccessModifiers.method2();
//AccessModifiers.method3();// privite is not visible outside the class



    }
}
