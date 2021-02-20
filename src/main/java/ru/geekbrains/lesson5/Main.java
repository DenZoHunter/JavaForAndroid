package ru.geekbrains.lesson5;

public class Main {
    public static void main(String[] args) {

        Employee denis = new Employee("Крупнов Денис Александрович", "Android developer",
                "denzohunter@bk.ru", 79999999, 15000, 27);


        denis.printEmployeeInfo();

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Java developer",
                "ivanovii@bk.ru", 155964218, 200000, 30);

        employeesArray[1] = new Employee("Петров Петр Петрович", "Android developer",
                "petrov-p-p@bk.ru", 158412456, 150000, 44);

        employeesArray[2] = new Employee("Сидоров Сидр Сидорович", "C++ developer",
                "sidr@bk.ru", 952156781, 400000, 50);

        employeesArray[3] = new Employee("Илонов Маск Марсович", "CEO",
                "imtheboss@mars.x", 7777777, 999999, 49);

        employeesArray[4] = new Employee("Цукербергов Марк Фейсович", "CEO",
                "mark@facebook.com", 4444444, 600000, 36);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].employeeAge > 40) {
                employeesArray[i].printEmployeeInfo();
            }
            System.out.println();
        }

    }

}

