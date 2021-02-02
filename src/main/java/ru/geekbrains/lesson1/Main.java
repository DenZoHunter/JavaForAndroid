package ru.geekbrains.lesson1;

public class Main {
    public static void main(String[] args) {

// 2. Создать переменные всех пройденных типов данных и инициализировать их значения.

        byte valueByte = -20;
        short valueShort = 14;
        int valueInt = 28;
        long valueLong = 1000000000L;
        float valueFloat = 12.34f;
        double valueDouble = 50.20;
        char valueChar = 'D';
        boolean valueBoolean = true;
        String valueString = "Denis";

//        проверка метода calculateFloatMethod
        System.out.println(calculateDoubleMethod(3, 9, 17, 18));
//        проверка метода within10To20
        System.out.println(within10To20(1, 4));
//        проверка метода numberPositiveOrNegative
        numberPositiveOrNegative(4);
        numberPositiveOrNegative(0);
        numberPositiveOrNegative(-10);
//        проверка метода checkNumberNegative
        System.out.println(checkNumberNegative(-5));
        System.out.println(checkNumberNegative(8));
//        проверка метода helloString
        helloString("Денис");
//        проверка метода checkYear
        checkYear(2020);
        checkYear(200);

    }


//  3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
// где a, b, c, d – входные параметры этого метода.

    public static double calculateDoubleMethod(int a, int b, int c, int d) {
        return a * (b + ((double) c / (double) d));
    }

//  4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;

    public static boolean within10To20(int firstVal, int secondVal) {
        if (firstVal + secondVal >= 10 && firstVal + secondVal <= 20) {
            return true;
        } else
            return false;
    }

//    5. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
//    Замечание: ноль считаем положительным числом.

    public static void numberPositiveOrNegative(int numberForCheck) {
        if (numberForCheck >= 0) {
            System.out.println("Число " + numberForCheck + " положительное");
        } else {
            System.out.println("Число " + numberForCheck + " отрицательное");
        }
    }

//    6. Написать метод, которому в качестве параметра передается целое число,
//    метод должен вернуть true, если число отрицательное;

    public static boolean checkNumberNegative(int numberForCheck) {
        return numberForCheck < 0;
    }

//  7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//  метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void helloString(String userName) {
        System.out.println("Привет, " + userName + "!");
    }

//  8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }
    }
}
