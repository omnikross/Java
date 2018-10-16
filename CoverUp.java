package com.company;

import java.util.ArrayList;

public class Main {

    public Main() {
        //constr
    }

    public void CoverUp (String adress) {
        int start = ' ';
        int end = ' ';
        char chars[] = adress.toCharArray();
        for (int i = 0; i < adress.length(); i++) {
            if (chars[i] == '@') {
                start = i;
            }
            if (chars[i] == '.' && i > start) {
                end = i;
            }
            if (i > start && i < end) {
                chars[i] = '*';
            }
        }
        System.out.println(chars);
    }


    public static void main(String[] args) {
	// write your code here

        Main constr = new Main();

        String mail = "renita.erskine.erskine@mail.ru";

        constr.CoverUp(mail);
    }
}
