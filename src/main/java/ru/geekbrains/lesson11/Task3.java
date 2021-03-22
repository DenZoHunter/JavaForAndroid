package ru.geekbrains.lesson11;

/*
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты.
Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.
* */

public class Task3 {

    public static void main(String[] args) {

        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(1.5f);

        Box<Apple> appleBox = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBoxTwo = new Box<>();

        appleBox.add(apple);
        appleBox.add(apple);

        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);


        orangeBoxTwo.add(orange);
        orangeBoxTwo.add(orange);
        orangeBoxTwo.add(orange);

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBoxTwo.getWeight());

        System.out.println("Сравним вес первой и второй коробки с апельсинами: " + orangeBox.compare(orangeBoxTwo));

        System.out.println("Пересыпаем апельсины с первой коробки во вторую");
        orangeBox.moveAt(orangeBoxTwo);

        System.out.println("Вес первой коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBoxTwo.getWeight());

    }


}
