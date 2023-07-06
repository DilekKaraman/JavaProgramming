package day23;

public class DollarTOEuro {
    public static void main(String[] args) {
dollarToEuro(30,1.3);
    }

    public static void dollarToEuro(double dollar,double parite){
        double dollarToEuro=dollar*parite;
        double euro=dollarToEuro;
        System.out.println(dollar+" dollar is equal to "+euro+" euro.");
    }
}
/*create a method that can convert dollar to euro

 */