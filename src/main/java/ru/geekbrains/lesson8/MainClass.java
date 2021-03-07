package ru.geekbrains.lesson8;

public class MainClass {

    public static void main(String[] args) {

        Human denis = new Human("Denis", 27, 1000, 1);
        Human elon = new Human("Elon", 49, 2000, 2);

        Cat alisa = new Cat("Alisa", 2, 100, 3);
        Cat simon = new Cat("Simon", 4, 200, 4);

        Robot walle = new Robot("Wall-e", 800, 5000, 5);
        Robot siri = new Robot("Siri", 5, 3000, 6);

        Obstacles team[] = {denis, elon, alisa, simon, walle, siri};


        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Wall wall3 = new Wall(3);

        Treadmill treadmill1 = new Treadmill(100);
        Treadmill treadmill2 = new Treadmill(500);
        Treadmill treadmill3 = new Treadmill(4000);

        Hurdles runWay[] = {wall1, wall2, wall3, treadmill1, treadmill2, treadmill3};



    }
}
