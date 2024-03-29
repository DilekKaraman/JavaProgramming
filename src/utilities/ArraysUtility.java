package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in seperate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }
    }

    // prints each double of an double array in seperate lines
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }
    }

    // prints each char of an char array in seperate lines
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);

        }
    }

    // prints each String of an String array in seperate lines
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }
    }

    //returns the max number for integer array
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the max number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the min number for integer array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
    //returns the min number for double array
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }

    // checks if the given integer is contained in the givin array. returns boolean. contains(int[] int)
   public static boolean contains(int[] array,int element){
        boolean result=false;
       for (int each : array) {
         if (each==element){
             result=true;

         }
       }
       return result;
   }
    // checks if the given double is contained in the givin array. returns boolean. contains(int[] int)
    public static boolean contains(double[] array,double element){
        boolean result=false;
        for (double each : array) {
            if (each==element){
                result=true;

            }
        }
        return result;
    }

    public static boolean contains(char[] array,char element){
        boolean result=false;
        for (char each : array) {
            if (each==element){
                result=true;

            }
        }
        return result;
    }

    public static boolean contains(String[] array,String element){
        boolean result=false;
        for (String each : array) {
            if (each.equals(element)){
                result=true;

            }
        }
        return result;
    }
    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    //{1,2,3,4}, 5
    //new array ==> {1,2,3,4,5}
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //3create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //4 create a return method called addChar that can add char after last index of a char array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count=0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static double frequencyOfElement(double[] array, double element){
        double count=0;
        for (double each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static char frequencyOfElement(char[] array, char element){
        char count=0;
        for (char each : array) {
            if(each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count=0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }

    //return the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result={};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);


            }
        }
        return result;
    }

    //return the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result={};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);


            }
        }
        return result;
    }

    //return the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result={};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);


            }
        }
        return result;
    }

    //return the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result={};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result=ArraysUtility.addElement(result,each);


            }
        }
        return result;
    }

    //  removes the index from the array,returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {


            if (i == index) {// if the element of array is matching with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //  removes the index from the array,returns new array
    public static double[] removeElement(double[] array, double index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {


            if (i == index) {// if the element of array is matching with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //  removes the index from the array,returns new array
    public static char[] removeElement(char[] array, char index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {


            if (i == index) {// if the element of array is matching with the element at given index
                continue;// skip
            }
            result[j++] = array[i];
        }
        return result;

    }

    //  removes the index from the array,returns new array
    public static String[] removeElement(String[] array, int index){

        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result= new String[array.length-1];
        int j=0;
        for (int i = 0; i <array.length ; i++) {


            if(i==index){// if the element of array is matching with the element at given index
                continue;// skip
            }
            result[j++]=array[i];
        }
        return result;

    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1,int[] arr2){

        int[] result={};
        for (int each : arr1) {
            result=addElement(result,each);
        }
        for (int each : arr2) {
           result=addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge2(int[] arr1,int[] arr2){

        int[] result={};


        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);

        }

        for (int each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1,double[] arr2){

        double[] result={};


        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);

        }

        for (double each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1,char[] arr2){

        char[] result={};


        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);

        }

        for (char each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1,String[] arr2){

        String[] result={};


        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);

        }

        for (String each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // reverse to array, returns a new array
    public static int[] reverse(int[] array){
        int[] result=new int[array.length];
        for (int i =array.length-1, j=0 ;i>0; i--,j++) {

            result[j]=array[i];
        }
        return result;
    }

    // reverse to array, returns a new array
    public static double[] reverse(double[] array){
        double[] result=new double[array.length];
        for (int i =array.length-1, j=0 ;i>0; i--,j++) {

            result[j]=array[i];
        }
        return result;
    }

    // reverse to array, returns a new array
    public static char[] reverse(char[] array){
        char[] result=new char[array.length];
        for (int i =array.length-1, j=0 ;i>0; i--,j++) {

            result[j]=array[i];
        }
        return result;
    }

    // reverse to array, returns a new array
    public static String[] reverse(String[] array){
        String[] result=new String[array.length];
        for (int i =array.length-1, j=0 ;i>0; i--,j++) {

            result[j]=array[i];
        }
        return result;
    }

    // replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index<0||index >array.length-1){
            System.out.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index<0||index >array.length-1){
            System.out.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index<0||index >array.length-1){
            System.out.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }

    // replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index<0||index >array.length-1){
            System.out.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index]=newElement;
        return array;
    }

    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array ;
    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array ;
    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array ;
    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i <array.length ; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }

        }
        return array ;
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result={};

        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result={};

        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result={};

        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result={};

        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}
