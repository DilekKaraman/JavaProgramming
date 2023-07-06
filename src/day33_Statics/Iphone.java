package day33_Statics;

public class Iphone {
public static String bran="Apple";

public String model;
public double price;
public static String OS="IOS";
public String color;

public static String size;
public static String madeIn="China";
public static boolean isBattery= true;
public static boolean isTouchScreen=true;
  public static boolean isFaceTime=true;


  public static void printModelPrice(){
    //System.out.println(model+":"+ price);// static methods does not accept instances
  }

  public void method(){
    System.out.println(model+":"+price);
    System.out.println(OS);
  }
}
