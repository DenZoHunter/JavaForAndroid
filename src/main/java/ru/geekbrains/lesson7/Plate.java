package ru.geekbrains.lesson7;

public class Plate {
    private int foodInPlate;

    public Plate(int foodInPlate) {
        this.foodInPlate = foodInPlate;
    }

    public int getFoodInPlate() {
        return foodInPlate;
    }

    public void decreaseFood(int n) {
        foodInPlate -= n;
    }

    public void addFood(int food) {
        foodInPlate += food;
    }

    public void infoFoodInPlate() {
        System.out.println("Еды в тарелке: " + foodInPlate);
    }


}
