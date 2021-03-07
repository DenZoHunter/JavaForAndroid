package ru.geekbrains.lesson8;

public class Cat implements Obstacles {
    protected String name;
    protected int age;
    private int maxRun;
    private int maxJump;
    boolean active;

    public Cat(String name, int age, int maxRun, int maxJump) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        active = true;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }


    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() <= this.getMaxJump()) {
            System.out.println(name + " перепрыгнул через стену.");
        } else {
            active = false;
            System.out.println(name + " не смог перепрыгнуть через стену.");
        }
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() <= this.getMaxRun()) {
            System.out.println(name + " пробежал по беговой дорожке");
        } else {
            active = false;
            System.out.println(name + " не смог пробежать по беговой дорожке");
        }
    }
}


