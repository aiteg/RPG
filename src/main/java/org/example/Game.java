package org.example;

import java.util.Scanner;


public class Game {
    public static void main(String[] args) throws Exception{

        int fl = 0;
        int lvl = 0;

        Scanner sc = new Scanner(System.in);
        new Choice(0);


        while(true) {
            int ch = sc.nextInt() + fl;
            new Choice(ch);
            fl += 3;

        }
    }
}
