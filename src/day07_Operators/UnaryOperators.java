package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away
        System.out.println(a);//26
        --a; // pre decrement: decrease the value by 1 right away
        System.out.println(a);// son islemde a=26 idi onun uzerinden 1 azaltir 25 olur

        int b = 100;
        System.out.println(++b);//101
        int c=100;
        System.out.println(c++);//101

        int y=8;
        System.out.println(++y);//9
        System.out.println(y++);// bir onceki degeri alir 9 olur ama y nin bu islemdeki degeri hafizada 9 oldu islemi yapar hafizada ama deger olarak bir onceki islemin degerini atar.
        System.out.println(y);//10 // son islemin degerinde y ne olduysa degeri odur.

        int z= 20;
        System.out.println(--z);// 19
        System.out.println(z--);//19 ama hafizda z 18 oldu
        System.out.println(z);//18
        ;

    }
}
