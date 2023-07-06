package week4;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        double totalPrice= 20;
        if(totalPrice>=25){
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $"+ totalPrice);

        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING.Your total order is: $"+totalPrice);

        }
    }
}
