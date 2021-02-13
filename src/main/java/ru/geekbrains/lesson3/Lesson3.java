package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

//Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
//После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        System.out.println("Приветству вас! Добро пожалость в игру - Угадай число!");
        System.out.println("Ваша задача угадать число от 0 до 9, на игру даётся 3 попытки: ");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10);
        int userTryCount = 3;
        int userTry = 1;
        boolean inGame = true;
        boolean userWon = false;

        while (inGame) {
            System.out.println("Введите число: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer > randomNumber) {
                System.out.println("Ваше число больше загаданного!");
            } else if (userAnswer < randomNumber) {
                System.out.println("Ваше число меньше загаданного!");
            } else if (userAnswer == randomNumber) {
                System.out.println("Поздравляю, вы угадали!");
                userWon = true;
            }

            if (userTry == userTryCount) {
                System.out.println("Ваши попытки закончились!");
                inGame = playAgainGame();
                userTry = 0;
            } else if (userWon) {
                inGame = playAgainGame();
              userTry = 0;
            }
            userTry++;
        }
    }

    private static boolean playAgainGame() {
        Scanner scannerAnswer = new Scanner(System.in);
        int answer;

        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет: ");
            answer = scannerAnswer.nextInt();
        } while (answer < 0 || answer > 1);

        return answer == 1;
    }
}

