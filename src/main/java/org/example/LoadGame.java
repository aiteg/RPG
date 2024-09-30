package org.example;

import lombok.NoArgsConstructor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class LoadGame {
    Scanner load = new Scanner(new FileReader("/Users/aiteginbaratov/IdeaProjects/RPGoBLIN/src/main/java/SaveGame/MySave.txt"));
    Scanner sc = new Scanner(System.in);
    private int loadPart;

    public LoadGame() throws FileNotFoundException {
        try {
            load = new Scanner(new FileReader("/Users/aiteginbaratov/IdeaProjects/RPGoBLIN/src/main/java/SaveGame/MySave.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Файл сохранений не найден.");
            throw e;
        }
    }

    public int choiceLoad() throws FileNotFoundException {
        System.out.println("Введите номер сохраненной игры: ");
        int ch = sc.nextInt();

        try {
            load = new Scanner(new FileReader("/Users/aiteginbaratov/IdeaProjects/RPGoBLIN/src/main/java/SaveGame/" + ch + ".txt"));
        } catch (FileNotFoundException e) {
            System.out.printf("Такого сохранения нет");
            throw e;
        }
        return 1;
    }



}

/*                                               4 5 6
    *       7 8 9                               10 11 12                            13 14 15
    *       16 17 18                            19 20 21                            22 23 24
    *       25 26 27                            28 29 30                            31 32 33
    *       34 35 36                            37 38 39                            40 41 42
    *       43 44 45                            46 47 48                            49 50 51
    *       52 53 54                            55 56 57                            58 59 60
  61 62 63  64 65 66  67 68 69        70 71 72  73 74 75  76 77 78        79 80 81  82 83 84  85 86 87


*
*
*
*
*
*/