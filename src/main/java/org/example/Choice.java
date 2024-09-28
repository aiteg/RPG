package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Choice {
    private String allText = "/Users/aiteginbaratov/IdeaProjects/RPGoBLIN/src/main/java/AllText/";
    private int ch;

    private String[] choices = {
            "0_start.txt","1_Начать игру.txt", "2_Загрузить игру.txt", "3_Выход.txt", "4_Деревня.txt", "5_Лес.txt", "6_Джакарта.txt", "7_Смачно.txt", "8_СКРРРААА.txt", "", "", "", "", ""
    };

    public Choice(int ch) throws FileNotFoundException {
        this.ch = ch;
        Scanner scanner = new Scanner(new FileReader(allText + choices[ch]));


        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        if (ch == 3) {
           System.exit(0);
        }

    }


}
