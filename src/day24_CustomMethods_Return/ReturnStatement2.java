package day24_CustomMethods_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfMonth(7);

    }
    public static void nameOfMonth(int number) {
if(number<1 || number>12){
    System.out.println("Invalid");
    return;
}

        //3. create a method that can display the name of month based on the given number to the method
        String name = (number == 1) ? "January" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ?
                "June" : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" :
                "Dec";
        System.out.println("month name = " + name);
    }
}