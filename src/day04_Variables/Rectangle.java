package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        int length= 10;
        int width= 14;
        int area= length* width;
        int perimeter = 2 * (length + width);

        System.out.println(area);
        System.out.println(perimeter);

        System.out.println("width = cm" + width);
        System.out.println("length = cm" + length);
        System.out.println("area = cm" + area);
        System.out.println("perimeter = cm" + perimeter);
    }
}
