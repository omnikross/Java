package com.company;

import java.util.ArrayList;
/*
*
* THIS PROGRAM REPLACE ELEM IN ARRAY BY USING BUBBLE SORT
*
*/
public class Main {

    public Main() {
        //constr
    }

    public void Replace(int[] stack) {
        int temp = 0;
        int size = stack.length;
        for ( int i = 0; i < size - 1; i++ ) {
            for ( int j = 0; j < i+1; j++ ) {
                temp = stack[j];
                stack[j] = stack[j + 1];
                stack[j + 1] = temp;
            }
        }
        for ( int i = 0; i < size; i++ ) {
            System.out.println(stack[i] + " ");
        }
    }
    public static void main(String[] args) {
        // write your code here
        Main rep = new Main();

        int array[] = new int[6];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;

        rep.Replace(array);
    }
}
