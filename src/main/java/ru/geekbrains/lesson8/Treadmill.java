package ru.geekbrains.lesson8;

public class Treadmill implements Hurdles {
    protected int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }



    @Override
    public void doIt(Obstacles o) {
        o.run(this);
    }
}
