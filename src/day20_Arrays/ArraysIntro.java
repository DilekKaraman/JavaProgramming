package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String[] myGroup=new String[5];//0~4
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        //myGroup[5]="Muhtar"; giremezsin Array i 5 e kadar tanimladin 0~4 arasi girilir
       // System.out.println(myGroups); hashcode
        System.out.println(Arrays.toString(myGroup));//["Gunay", "Neire", "Hulya", "Mikael"]





        System.out.println("---------------------------------------------");

        int[]myGroup1=new int[5];
        System.out.println(Arrays.toString(myGroup1));

        System.out.println("---------------------------------------------");

        String days[]={"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));
int num=5;
if(num<1||num>7){
    System.err.println("Invalid Number");
    System.exit(0);
}
        System.out.println(days[num-1]);




    }
}
