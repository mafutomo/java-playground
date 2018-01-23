package com.galvanize;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    //psvm

    public static void compareToFive (int value) {
        if(value < 5 ) {
             System.out.println("it's less than five!");
        } else {
             System.out.println("it's MORE than five");
        }
    }

    //In the space given below, define and implement a method called isActive.
    // It takes as input a String and returns
    // true if the passed in string is "active", false if it is
    // any other string.

    public static boolean isActive(String status){
        if(status.equals("active")){
            return true;
        } else {
            return false;
        }
    }

    public static String grade (int input) {
        if(input > 89) {
            return "A";
        } else if ((input < 90) && (input > 79) ) {
            return "B";
        } else if (input > 69){
            return "C";
        } else if (input > 59) {
            return "D";
        } else {
            return "F";
        }
    }

    //Using a while loop, print the
    // integers from 45 through 50 to the console.
    public static void while45To50 (){
        int x = 44;
        while (x < 50) {
            System.out.println(x = x + 1);
        }
    }

    //Using a for loop, print the even
    //integers from 2 through 6 to the console.

    public static void forLoop() {

        for(int i = 1; i <= 6; i ++) {

            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        //sout
//        int input = 3;
//
//       compareToFive(input);
//
//       String statement = "asdkfjhasdf";
//        System.out.println(isActive(statement));
//
//        int gradeLetter = 2;
//        System.out.println(grade(gradeLetter));

//        while45To50();
//        forLoop();

        int a = 3;
        int b = a;
        a = 10;

        int[] intArr = new int [] {1,2,3,4};
        String[] myStringArray = new String[]{"a","b","c"};

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(Arrays.toString(intArr));


        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(7);


        System.out.println("myList = " + myList);
    }
}
