package com.company;

import java.util.ArrayList;

public class Operation {

    private static final int CAPACITY = 3;
    private int pointer = 0;
    private ArrayList<String> arrayList = new ArrayList<>(CAPACITY);

    public void addElement(String element) {
        if (arrayList.size() == CAPACITY) {
            arrayList.remove(pointer);
            arrayList.add(pointer, element);
            pointer++;
        } else {
            arrayList.add(element);
        }
    }

    public ArrayList<String> getElements() {
        return new ArrayList<>(arrayList);
    }
}
