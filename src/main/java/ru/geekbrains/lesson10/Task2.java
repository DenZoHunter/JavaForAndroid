package ru.geekbrains.lesson10;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Krupnov", "111111111");
        phoneBook.add("Alekseev", "222222222");
        phoneBook.add("Gagarin", "333333333");
        phoneBook.add("Vershinin", "444444444");
        phoneBook.add("Polskiy", "555555555");
        phoneBook.add("Zaharov", "666666666");
        phoneBook.add("Krupnov", "777777777");

        System.out.println(phoneBook.get("Alekseev"));
        System.out.println(phoneBook.get("Zaharov"));
        System.out.println(phoneBook.get("Krupnov"));
    }
}
