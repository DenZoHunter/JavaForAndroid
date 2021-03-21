package ru.geekbrains.lesson11;

/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
* */

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        swapArraysElements(array,1,2);
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }




    private static <E> void swapArraysElements(E[] userArray, int firstIndex, int secondIndex) {
        E elementForSwap = userArray[firstIndex];
        userArray[firstIndex] = userArray[secondIndex];
        userArray[secondIndex] = elementForSwap;
    }

}
