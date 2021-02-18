package ru.geekbrains.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class lesson3Task2 {

    public static void main(String[] args) throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        int numberForWords = random.nextInt(words.length);
        String wordForGame = words[numberForWords];

        System.out.println("Загаданное слово:" + wordForGame);

        System.out.println("Введите слово:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userAnswer = reader.readLine();
        System.out.println("Введенное слово:" + userAnswer);

        if (userAnswer.equals(wordForGame)) {
            System.out.println("Вы угадали!");
        } else {
            System.out.println("Вы не угадали");
        }

        for (int i = 0; i < wordForGame.length(); i++) {
            if (wordForGame.charAt(i) == userAnswer.charAt(i)) {
                char a = wordForGame.charAt(i);
                System.out.print(a);
            }else if (wordForGame.charAt(i) != userAnswer.charAt(i)) {
                for (int j = 0; j < (15 - i); j++) {
                    System.out.print("#");
                }
            }
        }
    }
}
