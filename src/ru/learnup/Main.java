package ru.learnup;

import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.stream.*;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

// Задание №1 к уроку 1
//    public static void main(String[] args) {
//        String result = getInformationTheAuthor();
//        System.out.println(result);
//
//    }
//
//    private static String getInformationTheAuthor() {
//        StringBuilder stringInformation = new StringBuilder();
//        stringInformation.append(ANSI_BLUE + "Привет меня зовут Владимир. Мне 31 год, я из Ростова-на-Дону." + ANSI_RESET);
//        stringInformation.append(ANSI_RED + System.lineSeparator() + "Хобби: баскетбол, фитнес, сборка ПК, гонки." + ANSI_RESET);
//        stringInformation.append(ANSI_GREEN + System.lineSeparator() + "В прошлом я строитель, с начала 2019 года ушел в IT сферу. Начал обучения со школы Нетология, сначала смотрел бесплатные уроки." + ANSI_RESET);
//        stringInformation.append(ANSI_YELLOW + System.lineSeparator() + "Потом пошел на платное обучение и освоил профессию fullstack-дизайнер, параллельно работая верстальщиком и изучая фрейворк Angular." + ANSI_RESET);
//        stringInformation.append(ANSI_PURPLE + System.lineSeparator() + "Понял под конец, что не со всем моё направление, начал изучать frontend-разработку. Так же не много удалось поработать backend-разработчиком на php." + ANSI_RESET);
//        stringInformation.append(ANSI_CYAN + System.lineSeparator() + "Пока все еще в поиске себя и получения новых знаний. Спасибо за внимание!");
//        return stringInformation.toString();
//    }

    //  Задание №2 к уроку 3
    public static void main(String[] args) {

//        1 способ решение данной задачи
        int[] integerArray = new int[20];

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = (int) (Math.random() * 10000);
        }

        System.out.println(ANSI_RED + "\nПервый способ заполнение массива с помощтю цикла псевдослучайными значениями:\n" + ANSI_RESET);

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println("Индекс элемента массива " + i + ": " + integerArray[i] + ",\n");
        }
        // Еще один вариант подсчета суммы элементов массива!
        int sum = IntStream.of(integerArray).sum();
        System.out.println(ANSI_BLUE + "Сумма элементов массива: " + ANSI_RED + sum + ANSI_RESET);

        // Это уже как требовалось в задании с помощью метода!
        System.out.println(ANSI_BLUE + "\nСумма элементов массива: " + ANSI_RED + getSum(integerArray) + ANSI_RESET);

        // Сумма либо делится нацело на 2, либо нет.
        if (getSum(integerArray) % 2 == 0) {
            System.out.println(ANSI_GREEN + "\nЧЕТНО" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "\nНЕЧЕТНО" + ANSI_RESET);
        }

        // 2 способ решение данной задачи

        int[] integerArrayTwo = new int[20];
        Random random = new Random();

        for (int i = 0; i < integerArrayTwo.length; i++) {
            integerArrayTwo[i] = random.nextInt(999999);
        }

        System.out.println(ANSI_RED + "\nВторой способ заполнение массива с помощтю цикла псевдослучайными значениями:\n" + ANSI_RESET);

        for (int i = 0; i < integerArrayTwo.length; i++) {
            System.out.println("Индекс элемента массива " + i + ": " + integerArrayTwo[i] + ",\n");
        }

// Еще один вариант подсчета суммы элементов массива!
        int sumNumberElement = IntStream.of(integerArrayTwo).sum();
        System.out.println(ANSI_BLUE + "Сумма элементов массива: " + ANSI_RED + sumNumberElement + ANSI_RESET);

        System.out.println(ANSI_BLUE + "\nСумма элементов массива: " + ANSI_RED + getSum(integerArrayTwo) + ANSI_RESET);

// Сумма либо делится нацело на 2, либо нет.
        if (getSum(integerArrayTwo) % 2 == 0) {
            System.out.println(ANSI_GREEN + "\nЧЕТНО" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "\nНЕЧЕТНО" + ANSI_RESET);
        }
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
