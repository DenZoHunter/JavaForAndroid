package ru.geekbrains.lesson11;

/*
2. Написать метод, который преобразует массив в ArrayList;
* */

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        String[] arrayString = {"Один", "Два", "Три", "Четыре", "Пять"};
        List<String> arrayList = convertToArrayList(arrayString);

        System.out.println(Arrays.toString(arrayString));
        System.out.println(arrayList);

    }

    private static <E> List<E> convertToArrayList(E[] userArray) {
        return Arrays.asList(userArray);
    }
}
