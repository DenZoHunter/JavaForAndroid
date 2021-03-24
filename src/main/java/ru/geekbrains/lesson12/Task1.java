package ru.geekbrains.lesson12;

import java.util.Arrays;

/*
* Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:

static final int SIZE = 10 000 000;
static final int HALF = size / 2;
float[] arr = new float[size].

2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:

arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
* */
public class Task1 {

    public static final int SIZE = 10_000_000;
    public static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        methodOne();
        methodTwo();


    }

    public static void methodOne() {
        float[] arrOne = new float[SIZE];

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1;
        }

        long timeToComplete = System.currentTimeMillis(); //засекаем время

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = (float) (arrOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Первый метод выполняет формулу за: " + (System.currentTimeMillis() - timeToComplete) + " милисекунд."); //выводим время
    }

    public static void methodTwo() {

        float[] arrTwo = new float[SIZE];

        float[] arrTwo1 = new float[HALF];
        float[] arrTwo2 = new float[HALF];

        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = 1;
        }

        long timeToComplete = System.currentTimeMillis(); // засекаем время

        System.arraycopy(arrTwo, 0, arrTwo1, 0, HALF);
        System.arraycopy(arrTwo, HALF, arrTwo2, 0, HALF);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arrTwo1.length; i++) {
                arrTwo1[i] = (float) (arrTwo1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < arrTwo2.length; i++) {
                arrTwo2[i] = (float) (arrTwo2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arrTwo1, 0, arrTwo, 0, HALF);
        System.arraycopy(arrTwo1, 0, arrTwo, HALF, HALF);

        System.out.println("Второй метод выполняет формулу за: " + (System.currentTimeMillis() - timeToComplete) + " милисекунд."); //выводим время

    }

}
