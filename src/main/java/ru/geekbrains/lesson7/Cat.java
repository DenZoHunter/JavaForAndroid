package ru.geekbrains.lesson7;

public class Cat {

    private String nameCat;
    private int appetiteCat;
    private boolean hunger;

    public Cat(String nameCat, int appetiteCat) {
        this.nameCat = nameCat;
        this.appetiteCat = appetiteCat;
        hunger = true;
    }

    public void eatCat(Plate p) {
        if (p.getFoodInPlate() >= appetiteCat) {
            p.decreaseFood(appetiteCat);
            hunger = false;
        } else {
            hunger = true;
        }
    }


    public void infoHungerCat() {
        System.out.println("Голод кота " + nameCat + " : " + hunger);
    }


}
