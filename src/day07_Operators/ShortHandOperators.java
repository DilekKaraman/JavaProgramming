package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // assignment

        int number = 100;
        System.out.println("number = " + number);//100
        number = 200;
        System.out.println("number = " + number);//200
        // bir kez variable type i tanimladiktan sonra ona atama yapabilirsin en son ne yazrsan o olur.
        // aynisi stringler icinde gecerli
        String word = "Java Programming";
        System.out.println("word = " + word);
        word = "Wooden Spoon";
        System.out.println("word = " + word);
        word = "Cydeo";
        System.out.println("word = " + word);// tekrar string yada int yazmana gerek yok yazarsanda variable name i degistirmen gerek hata verir.
        word = "123" + 1;//1231
        System.out.println("word = " + word);


        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x + 100);//200

        x = 100 + 200;
        System.out.println("x = " + x);
        x += 300;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += "Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        System.out.println("_____________________________");
        double availablebalance = 1000.5;
        System.out.println("availablebalance = " + availablebalance);
        int deposit = 300;
        availablebalance += 300;
        System.out.println("availablebalance = " + availablebalance);
        //withdraw=500

        availablebalance -= 500;
        System.out.println("availablebalance = " + availablebalance);

// withdrawing 200$, then deposit 400$
        availablebalance -= 200;
        availablebalance += 400;
        System.out.println("availablebalance = " + availablebalance);
        System.out.println("-------------------------------------------");

        double salary = 50_000.05;

        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);
        double dodge = 0.00000001;

        dodge *= 1000000;
        System.out.println("dodge = " + dodge);
        System.out.println("--------------------------------------------");
        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------------");

        double num3 = 100;
        System.out.println("num3 = " + num3);
        num3 %= 3;
        System.out.println("num3 = " + num3);
        System.out.println("---------------------------------------------");

        int amount = 127; // cents
        int quarter = amount / 25;
        int cents = amount % 25;
        System.out.println("cents = " + cents);
        System.out.println("quarter = " + quarter);
        System.out.println("--------------------------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);
        System.out.println("---------------------------------------------");

        int y = 300;
        y %= 16;
        System.out.println("y = " + y);
        System.out.println("---------------------------------------------");
        int balance = 3500;

        //insurance fee = 153

        balance %=153;

        System.out.println("balance = " + balance);



    }
}
