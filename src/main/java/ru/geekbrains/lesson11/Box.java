package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.List;

class Box<E extends Fruit> {

    private List<E> list;

    public List<E> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<E>();
    }

    void add(E obj) {
        list.add(obj);
    }

    float getWeight() {

        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    void moveAt(Box<E> box) {
        box.getList().addAll(list);
        list.clear();
    }


    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

}
