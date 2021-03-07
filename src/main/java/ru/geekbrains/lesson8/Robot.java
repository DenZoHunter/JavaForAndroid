package ru.geekbrains.lesson8;

public class Robot implements Obstacles {
    protected String name;
    protected int age;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int age, int maxRun, int maxJump) {
        this.name = name;
        this.age = age;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() <= this.getMaxJump()) {
            System.out.println(name + " перепрыгнул через стену.");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть через стену.");
        }
        return false;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() <= this.getMaxRun()) {
            System.out.println(name + " пробежал по беговой дорожке");
            return true;
        } else {
            System.out.println(name + " не смог пробежать по беговой дорожке");
        }
        return false;
    }
}
