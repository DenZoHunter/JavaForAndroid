package ru.geekbrains.lesson11;

abstract public class Fruit {

    private float weight;

    protected Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

}
