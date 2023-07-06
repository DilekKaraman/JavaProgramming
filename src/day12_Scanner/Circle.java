package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r=scan.nextDouble();
        scan.close();// bundan sonra herhangi bir scan la veri girisi yazilmis olsa bile user giremez kapandi.

        double area=r*3.14;
        double perimeter=2*r*3.14;
        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+perimeter);

    }
}
