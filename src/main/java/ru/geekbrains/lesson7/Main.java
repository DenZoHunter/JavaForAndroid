package ru.geekbrains.lesson7;

public class Main {

    public static void main(String[] args) {

        Cat alisa = new Cat("Alisa", 10);
        Cat bars = new Cat("Bars", 8);
        Cat martin = new Cat("Martin", 100);
        Cat sam = new Cat("Sam", 4);
        Cat jack = new Cat("Jack", 15);

        Cat[] cats = {alisa, bars, martin, sam, jack};

        Plate catPlate = new Plate(100);

        catPlate.infoFoodInPlate();


        for (Cat cat : cats) {
            cat.infoHungerCat();
        }

        System.out.println();

        for (Cat cat : cats) {
            cat.eatCat(catPlate);
        }

        for (Cat cat : cats) {
            cat.infoHungerCat();
        }


        catPlate.infoFoodInPlate();
        catPlate.addFood(100);
        catPlate.infoFoodInPlate();
    }


}
