package ru.geekbrains.lesson8;

public interface Obstacles {
    boolean run(Treadmill treadmill);
    boolean jump(Wall wall);
}
