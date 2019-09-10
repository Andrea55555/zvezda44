package com.company;

import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            run(number);
            System.out.println("\n" + "Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");

        }
    }
    private static void run(int vv) {
        for (int p = 0; p < vv; p++) { // колич елок
            for (int vv22 = 1; vv22 < vv+1; vv22++) {   // колич строк в елке
                for (int d = 0; d < vv+10; d++) {  // макушка
                    System.out.print(" ");
                }
                System.out.print(" ");
                for (int z = 0; z < 1; z++) {
                    System.out.println(ANSI_BLUE +"W" + ANSI_RESET);    // макушка закончилась
                }
                for (int i = 0; i < vv22+1; i++) {   //колич строк
                    for (int k = 0; k < (vv - i) + 10; k++) {   // ставятся пробелы + пробелы отступа елок
                        System.out.print(" ");
                    }
                    System.out.print(ANSI_RED + "/" + ANSI_RESET);   // гирлянда слева
                    for (int z = 0; z < (2 * i + 1); z++) {      // звездочки
                        System.out.print(ANSI_YELLOW + "*" + ANSI_RESET);
                    }
                    System.out.print(ANSI_RED + "\\" + ANSI_RESET);   // гирлянда справа
                    System.out.println();   // перенос строки после всех циклов
                }
                for (int d = 0; d < vv+10; d++) {       // ствол
                    System.out.print(" ");
                }
                    for (int z = 0; z < 1; z++) {
                        System.out.println(ANSI_CYAN + "HHH" + ANSI_RESET);    // ствол закончился
                    }
            }
            break;
        }
    }
}