package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int SIZE = 5;
    static final int SIZE_FOR_WIN = 4;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final char HEADER_FIRST_SYMBOL = '♥';
    static final String EMPTY = " ";

    static final char[][] MAP = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();
    static int turnsCount;


    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {

        //инициализация поля
        initMap();

        //печать поля в консоль
        printMap();

        //игра
        playGame();

    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        //печать заголовка
        printHeaderMap();

        //печать поля
        printBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + EMPTY);

        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();

    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + EMPTY);
            }
            System.out.println();
        }
    }


    private static void playGame() {

        turnsCount = 0;
        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);


            turnAI();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rowNumber;
        int columnNumber;
        boolean isInputValid = true;


        System.out.println("\nХод человека! Введите номера строки и столбца");
        do {
            rowNumber = -1;
            columnNumber = -1;
            isInputValid = true;

            System.out.print("Строка: ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt() - 1;
            } else {
                processingIncorrectInput();
                isInputValid = false;
                continue;
            }

            System.out.print("Столбик: ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt() - 1;
            } else {
                processingIncorrectInput();
                isInputValid = false;
            }

        } while (!(isInputValid && isHumanTurnValid(rowNumber, columnNumber)));

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static void processingIncorrectInput() {
        System.out.println("Ошибка ввода! Введите число в диапазоне размера игрового поля");
        in.next();
    }

    private static boolean isHumanTurnValid(int rowNumber, int columnNumber) {
        if (!isNumbersValid(rowNumber, columnNumber)) {
            System.out.println("\nПроверьте значения строки и столбца");
            return false;
        } else if (!isCellOccupancy(rowNumber, columnNumber)) {
            System.out.println("\nВы выбрали занятую ячейку");
            return false;
        }

        return true;
    }

    private static boolean isNumbersValid(int rowNumber, int columnNumber) {
        return !(rowNumber >= SIZE || rowNumber < 0 || columnNumber >= SIZE || columnNumber < 0);
    }

    private static boolean isCellOccupancy(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }


    private static void checkEnd(char symbol) {

        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Ура! Вы победили!");
            } else {
                System.out.println("Восстание близко... ИИ победил...");
            }
            System.exit(0);
        } else if (isMapFull()) {
            System.out.println("Ничья!");
            System.exit(0);
        }
    }

    private static boolean isMapFull() {
        return turnsCount == SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {

/*      2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
        3.* Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
        Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;*/

        int rowCountForWin = 0;
        int columnCountForWin = 0;
        int mainDiagonalCountForWin = 0;
        int sideDiagonalCountForWin = 0;

        for (int i = 0; i <= SIZE - 1; i++) {
            rowCountForWin = 0;
            columnCountForWin = 0;
            for (int j = 0; j <= SIZE - 1; j++) {

                //проверка по горизонтали и вертикали

                if (MAP[i][j] == symbol) {
                    rowCountForWin++;
                }
                if (MAP[j][i] == symbol) {
                    columnCountForWin++;
                }
            }
            if (rowCountForWin == SIZE_FOR_WIN || columnCountForWin == SIZE_FOR_WIN) {
                return true;
            }
        }

        //проверка по диагоналям

        for (int i = 0; i <= SIZE - 1; i++) {
            if (MAP[i][i] == symbol) {
                mainDiagonalCountForWin++;
            }
            if (MAP[i][SIZE - i - 1] == symbol) {
                sideDiagonalCountForWin++;
            }
        }
        if (mainDiagonalCountForWin == SIZE_FOR_WIN || sideDiagonalCountForWin == SIZE_FOR_WIN) {
            return true;
        }
        return false;
    }

    private static void turnAI() {
        int rowNumber;
        int columnNumber;

        System.out.println("\nХод компьютера!");




        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellOccupancy(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
}

