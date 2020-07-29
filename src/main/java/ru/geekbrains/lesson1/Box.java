package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> listFruit = new ArrayList<>();

    public void addFruit(T fruit) {
        listFruit.add(fruit);
    }

    public float getWeight() {
        float weightBox = 0.0f;
        for (int i = 0; i < listFruit.size(); i++) {
            weightBox += listFruit.get(0).getWeight();
        }
        return weightBox;
    }

    public boolean compare(Box box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001f;
    }

    public void addAllFruitWithBox(Box<? super T> box) {
        if (box == null) throw new NullPointerException();
        box.listFruit.addAll(listFruit);
        listFruit.clear();
    }
}
