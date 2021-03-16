package ru.geekbrains.lesson9;

/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета.
* */

public class Main {
    public static void main(String[] args) {

        String[][] arr =   {{"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "A"}};


        try {
            myArray(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Размер массива не равен 4x4!");
        }

        try {
            int sum = myArraySum(arr);
            System.out.println("Сумма массива: " + sum);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("В массиве присутствуют символы!");
            System.out.println("Символ в строке: " + e.i + " в столбце: " + e.j);
        }
    }

    public static void myArray(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
    }

    public static int myArraySum(String[][] arr) throws MyArrayDataException {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrSum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return arrSum;
    }
}
