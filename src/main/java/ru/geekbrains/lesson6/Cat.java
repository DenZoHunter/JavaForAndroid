package ru.geekbrains.lesson6;

public class Cat extends Animal {

    static int countCats;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        countCats++;
    }


    @Override
    public void run(int distance) {
        if (distance > 200 || distance < 0) {
            System.out.println(this.name + " не пробежит это расстояние " + "(" + distance + ")м.");
        } else {
            System.out.println(this.name + " пробежал: " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");
    }
}
