package ru.geekbrains.lesson10;

import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {

    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.
    * */
    public static void main(String[] args) {

        ArrayList<String> arrayWords = new ArrayList();
        arrayWords.add("Moscow");
        arrayWords.add("Vienna");
        arrayWords.add("Minsk");
        arrayWords.add("Ottawa");
        arrayWords.add("Paris");
        arrayWords.add("Berlin");
        arrayWords.add("Rome");
        arrayWords.add("London");
        arrayWords.add("Rome");
        arrayWords.add("Moscow");
        arrayWords.add("Dublin");
        arrayWords.add("Amsterdam");
        arrayWords.add("Oslo");

        System.out.println("Изначальный массив: " + arrayWords.toString());

        HashSet<String> setWordsUnique = new HashSet<>(arrayWords);
        System.out.println("Уникальные слова в массиве: " + setWordsUnique.toString());


        for (String word : setWordsUnique) {
            int count = 0;
            for (String arr : arrayWords) {
                if (word.equals(arr)) {
                    count++;
                }
            }
            System.out.println(word + " повторяется в списке " + count + " раз(а).");
        }

    }
}
