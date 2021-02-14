package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
//После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        System.out.println("Приветствую вас! Добро пожаловать в игру - Угадай число!");
        System.out.println("Ваша задача угадать число от 0 до 9, на игру даётся 3 попытки: ");

        Random random = new Random();

        int randomNumber = random.nextInt(10);
        final int USER_TRY_COUNT = 3;
        int userTry = 1;

        while (true) {
            System.out.println("Введите число: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer > randomNumber) {
                System.out.println("Ваше число больше загаданного!");
            } else if (userAnswer < randomNumber) {
                System.out.println("Ваше число меньше загаданного!");
            }
            if ((userAnswer == randomNumber) || (userTry == USER_TRY_COUNT)) {
                if (userTry == USER_TRY_COUNT)
                    System.out.println("Вы проиграли!");
                else
                    System.out.println("Поздравляю, вы угадали!");
                if (!playAgainGame())
                    break;
                else {
                    randomNumber = random.nextInt(10);
                    userTry = 0;
                }
            }
            userTry++;
        }
    }

    private static boolean playAgainGame() {
        int userAnswer;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет: ");
            userAnswer = scanner.nextInt();
        } while (userAnswer < 0 || userAnswer > 1);
        return userAnswer == 1;
    }
}

