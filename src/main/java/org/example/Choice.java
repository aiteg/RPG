package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Choice {
    private String allText = "/Users/aiteginbaratov/IdeaProjects/RPGoBLIN/src/main/java/AllText/";
    private int ch;

    private String[] choices = {
            "0_start.txt", "1_Начать игру.txt", "2_Загрузить игру.txt", "3_Выход.txt", "4_Деревня.txt",
            "5_Лес.txt", "6_Джакарта.txt", "7_Смачно.txt", "8_СКРРРААА.txt", "9_10дней.txt",
            "10_Не выходить.txt", "11_Прыгнуть с утеса.txt", "12_Поспать.txt",
            "13_Принять предложение.txt", "14_Прыжок в окно.txt", "15_Битва с демоном.txt",
            "16_СКРРРААА.txt", "17_Безделье-это.txt", "18_ЦАУ-ЦАУ.txt",
            "19_Наложницу с утеса.txt", "20_Еще раз с утеса.txt", "21_Сказать спасибо.txt",
            "22_Тайны леса.txt", "23_Союзники и враги.txt", "24_Путешествие во времени.txt",
            "25_Своё имя.txt", "26_Его имя.txt", "27_Откусить руку.txt",
            "28_Третий прыжок с утеса.txt", "29_Братоубийство.txt", "30_Охота на брата.txt",
            "31_Древний хранитель.txt", "32_Забытые знание.txt", "33_Читать свитки.txt",
            "34_Придумать план побега.txt", "35_Дождаться рождения ребенка.txt",
            "36_Начать репетировать.txt", "37_Имя брата.txt", "38_Истина игры.txt",
            "39_Метеорит.txt", "40_Поиск артефакта.txt", "41_Союз с хранителем.txt",
            "42_Предательство хранителя.txt", "43_Вышли в свободу.txt", "44_Оставить гоблинов.txt",
            "45_Нашли странника.txt", "46_Начать петь.txt", "47_Назвать ему своё имя.txt",
            "48_Назвать ему его имя.txt", "49_Турнир колизея.txt", "50_Забытый город.txt",
            "51_Найти друга.txt", "52_Найти деревню.txt", "53_Новые приключение с гоблинами.txt",
            "54_Попрощаться с гоблинами.txt", "55_Дом ведьмы.txt", "56_Волчья стая.txt",
            "57_Нашли сокровище.txt", "58_Хранитель ушёл своей дорогой.txt",
            "59_Грог ушёл своей дорогой.txt", "60_Попали в засаду.txt", "61_Тайный мир.txt",
            "62_Подозрительная книга.txt", "63_Древний магические артефакты.txt",
            "64_Читать карту.txt", "65_Открыть бизнес.txt", "66_Найти отца.txt",
            "67_Раздать артефакты.txt", "68_Пропавшая принцесса.txt", "69_Нашел старого друга.txt",
            "70_Найти гоблинов.txt", "71_На помощь!.txt", "72_Ближайший посёлок.txt",
            "73_Найти автора книгу.txt", "74_Закопать книгу.txt", "75_За жечь книгу.txt",
            "76_Применять маг артефакты.txt", "77_Создать свою деревню.txt",
            "78_Владелец маг артефактов.txt", "79_Том нашёл девушку.txt",
            "80_Деревня ганнибалов.txt", "81_Пираты.txt", "82_Найти специалиста.txt",
            "83_Оставить бизнес.txt", "84_Новый бизнес.txt", "85_Отец сам нашел меня.txt",
            "86_Теряете надежду.txt", "87_Колдун.txt", "88_Стать Королём.txt",
            "89_Построить город.txt", "90_Стать лидером сообщества.txt",
            "91_Просить руки принцессы.txt", "92_Купить коня.txt", "93_Пойти с новыми друзьями в паб.txt",
            "94_Напал дракон.txt", "95_Нападение эльфов и гномов.txt",
            "96_Улететь на Марс с другом.txt"
    };

    private int postch = 0;
    private int postch2 = 0;
    private int prech1;
    private int prech2;
    private int lvl = 0;
    private int savech;

    private int[][] _2choices = {{7, 8, 9}, {10, 11, 12}, {13, 14, 15}};

//    private LoadGame load = new LoadGame();
//    private SaveGame save = new SaveGame();

    public Choice() throws IOException {
        choice(ch);

        Scanner sc = new Scanner(System.in);

        while(true) {
            ch = sc.nextInt();

            switch(ch) {
//                case -1:
//                    save.saveGame(savech);
//                    lvl = -1;
//                    postch = 0;
//                    break;
                case 1:
                    break;
                case 2:
//                    if (lvl == 0) {
//                        System.out.println("d;sflja;l");
//                        ch = load.choiceLoad();
//                    }
                    break;
                case 3:
                    if (postch == 0) {
                        System.exit(0);
                    }
                    break;
                case 4:
                    lvl -= 2;
                    ch = postch2;
                    break;

            }

            postch2 = postch;
            postch = ch;

            switch(lvl) {
                case -1:
                    ch = 0;
                    break;
                case 1:
                    prech1 = ch;
                    ch += 3;
                    break;
                case 2,3,4,5,6,7:
                    ch = _2choices[prech1 -1][ch-1] + (lvl-2)*9;
                    prech2 = ch;
                    break;
                case 8:
                    System.out.println("CH: " + ch);
                    System.out.println("Ex: " + (((3 + (prech1 - 1) * 2) * 3) + ((postch2-1)*2) + (ch - 1)));
                    ch = prech2 + (6 * prech1 + 2 * postch2 + ch); //Формула без упрощений (((3 + (prech1 - 1) * 2) * 3) + ((postch2-1)*2) + (ch - 1))
                    System.out.println("postch " + postch);
                    System.out.println("prech2 " + prech2);
                    System.out.println("prech1 " + prech1);
                    break;


            }

            savech = ch;


//            System.out.println("txt: " + ch)
            choice(ch);
            lvl++;
        }
    }

    public void choice(int ch) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(allText + choices[ch]));

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }


}

