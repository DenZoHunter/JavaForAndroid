package ru.geekbrains.lesson6;

public class Main {

    public static void main(String[] args) {

        Animal barsCat = new Cat("Барсик", "Серый", 2);
        Animal alisaCat = new Cat("Алиса", "Белый", 1);
        Animal oscarCat = new Cat("Оскар", "Серый", 3);
        Animal rexDog = new Dog("Рекс", "Коричневый", 4);
        Animal scoobyDog = new Dog("Скуби-Ду", "Рыжый", 5);

        barsCat.run(20);
        alisaCat.run(600);
        oscarCat.run(10);
        oscarCat.swim(4);
        System.out.println("Создано котов: " + Cat.countCats);

        System.out.println();

        rexDog.run(50);
        rexDog.swim(16);
        scoobyDog.run(800);
        scoobyDog.swim(8);
        System.out.println("Создано собак: " + Dog.countDogs);

        System.out.println();
        System.out.println("Создано животных: " + (Cat.countCats + Dog.countDogs));

    }
}
