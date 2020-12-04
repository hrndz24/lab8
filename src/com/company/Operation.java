package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public boolean contains(String string) {
        for (String element : arrayList) {
            if (element.contains(string)) {
                return true;
            }
        }
        return false;
    }

    public void printSortedElementsLengths() {
        List<Integer> lengths = new ArrayList<>();
        arrayList.forEach(element -> lengths.add(element.length()));
        Collections.sort(lengths);
        System.out.println(lengths);
    }

    public ArrayList<String> getElements() {
        return new ArrayList<>(arrayList);
    }
}
