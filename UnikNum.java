package com.company;

import java.util.ArrayList;

/*
*
*THIS PROGRAM LOOKING FOR UNIK NUM IN ARRAY
*
*/

public class Main {

    public Main() {
       //construct
    }

    public void FindUnik (ArrayList<Integer> numbers) {

        int length = numbers.size();
        int unik = 0;
        int totalUnik = 0;
        if ( length < 1 ) {
            System.out.println("Error");
        } else {
            for ( int i = 0; i < length; i++ ) {
                for ( int j = i + 1; j < length; j++ ) {
                    if ( numbers.get(i) == numbers.get(j) ) {
                        unik++;
                    }
                }
            }
            totalUnik = length - unik * 2;
            System.out.println(totalUnik);
        }
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(2);
        array.add(2);
        array.add(3);
        array.add(3);
        array.add(4);
        array.add(9);
        array.add(5);
        array.add(8);

        Main find = new Main();
        find.FindUnik(array);
    }
}

