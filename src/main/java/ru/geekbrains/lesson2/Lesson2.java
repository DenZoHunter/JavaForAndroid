package ru.geekbrains.lesson2;


import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание №1:");
        int[] arrayForTask1 = {0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0};
        System.out.println("Изначальный массив: " + Arrays.toString(arrayForTask1));
        swapArray(arrayForTask1);
        System.out.println("Измененный массив: " + Arrays.toString(arrayForTask1));

//2. Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание №2:");
        int[] arrayForTask2 = new int[8];
        System.out.println("Изначальный массив: " + Arrays.toString(arrayForTask2));
        fillArray(arrayForTask2);
        System.out.println("Измененный массив: " + Arrays.toString(arrayForTask2));

// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание №3:");
        int[] arrayForTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Изначальный массив: " + Arrays.toString(arrayForTask3));
        numberLess6(arrayForTask3);
        System.out.println("Измененный массив: " + Arrays.toString(arrayForTask3));

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание №4:");
        int[][] arrayForTask4 = new int[5][5];
        System.out.println("Изначальный массив: ");
        printDeepArray(arrayForTask4);
        fillCrossDeepArray(arrayForTask4);
        System.out.println("Измененный массив: ");
        printDeepArray(arrayForTask4);

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arrayForTask5 = {5, 9, 10, 26, 48, 41, 20, 11, 52, 7, 9, 52, 14, 74, 17, 4};
        System.out.println("Задание №5:");
        System.out.println("Изначальный массив: " + Arrays.toString(arrayForTask5));
        findMinAndMaxElementInArray(arrayForTask5);

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.

        System.out.println("Задание №6:");
        int[] arrayForTask6 = {5, 4, 1, 8, 2, 4, 6, 14, 6, 20};
        System.out.println("Изначальный массив: " + Arrays.toString(arrayForTask6));
        System.out.println("Место где левая и права часть равны: " + findEqualsSumLeftRightSideArray(arrayForTask6));

//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементымассива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        System.out.println("Задание №7:");
        int[] arrayForTask7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberForTask7 = 3;
        System.out.println("Изначальный массив: " + Arrays.toString(arrayForTask7));
        shiftArrayByNumberElements(arrayForTask7, numberForTask7);
        System.out.println("Измененный массив: " + Arrays.toString(arrayForTask7));

    }


    public static void swapArray(int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] == 0) {
                userArray[i] = 1;
            } else {
                userArray[i] = 0;
            }
        }
    }

    public static void fillArray(int[] userArray) {
        int element = 0;
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = element;
            element += 3;
        }
    }

    public static void numberLess6(int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] < 6) {
                userArray[i] = userArray[i] * 2;
            }

        }
    }

    public static void printDeepArray(int[][] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                System.out.print(userArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void fillCrossDeepArray(int[][] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                if (i == j) {
                    userArray[i][j] = 1;
                } else if (i + j == userArray.length - 1) {
                    userArray[i][j] = 1;
                }
            }
        }
    }

    public static void findMinAndMaxElementInArray(int[] userArray) {
        int min = userArray[0];
        int max = userArray[0];
        for (int i = 0; i < userArray.length; i++) {
            if (i <= min) {
                min = userArray[i];
            } else if (i >= max) {
                max = userArray[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    public static boolean findEqualsSumLeftRightSideArray(int[] userArray) {

        int sumLeftSide = 0;
        int sumRightSide = 0;

        for (int i = 0; i < userArray.length; i++) {
            sumRightSide += userArray[i];
        }
        /* теперь у нас в левой части сумма 0, а в правой сумма всего массива
         далее перебираем массив и к левой сумме на каждой итерации прибавляем текущее число в массиве
         а из правой суммы убираем его*/

        for (int i = 0; i < userArray.length; i++) {
            sumLeftSide += userArray[i];
            sumRightSide -= userArray[i];
            if (sumLeftSide == sumRightSide) {
                return true;
            }
        }
        return false;
    }

    public static void shiftArrayByNumberElements(int[] userArray, int userNumber) {
        if (userNumber > 0) {
            for (int i = 0; i < userNumber; i++) {
                int LastValueOnArray = userArray[userArray.length - 1];//последнего в массиве запоминаем
                /*бежим от последнего до первого
                 и на место последнего копируем предпоследнее*/
                for (int j = userArray.length - 1; j > 0; j--) {
                    userArray[j] = userArray[j - 1];
                }
                userArray[0] = LastValueOnArray; //на первое место ставим последнего с массива
            }
        }else if (userNumber < 0) {
            for (int i = 0; i < userNumber * (-1); i++) {
                int firstValueOnArray = userArray[0]; // первого с массива запоминаем
                /*Бежим с первого до последнего
                * и на место первого комируем следующее*/
                for (int j = 0; j < userArray.length - 1; j++) {
                    userArray[j] = userArray[j + 1];
                }
                userArray[userArray.length - 1] = firstValueOnArray; //на последнее место ставим первое
            }
        }
    }

}
