package ru.geekbrains.lesson8;

public class Wall implements Hurdles {
    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void doIt(Obstacles o){
        o.jump(this);
    }

}
