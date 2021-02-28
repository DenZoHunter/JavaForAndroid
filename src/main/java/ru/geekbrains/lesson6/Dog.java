package ru.geekbrains.lesson6;

public class Dog extends Animal {

    static int countDogs;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        countDogs++;
    }


    @Override
    public void run(int distance) {
        if (distance > 500 || distance < 0) {
            System.out.println(this.name + " не пробежит это расстояние " + "(" + distance + ")м.");
        } else {
            System.out.println(this.name + " пробежал: " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10 || distance < 0) {
            System.out.println(this.name + " не проплывёт это расстояние " + "(" + distance + ")м.");
        } else {
            System.out.println(this.name + " проплыл " + distance + " м.");
        }
    }
}
