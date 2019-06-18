package com.homework;

import java.util.Arrays;
import java.util.Random;

public class Main {
    /*
    4) Заполнить массив случайными числами. Вывести элементы, которые больше среднего арифметического.
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[20];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(99) + 1;
            sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));

        double mean = 0.0;
        mean = sum / (double) arr.length;
        System.out.println("Сумма всех элементов массива - " + sum + ", среднее арифметическое всех элементов массива - " + mean);
        System.out.print("Элементы больше среднего арифметического: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mean) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
