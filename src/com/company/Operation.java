package com.company;

import java.util.*;

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

    public Map<String, Integer> getRepeatedElements() {
        Map<String, Integer> map = new HashMap<>();
        arrayList.forEach(element -> {
            if (map.containsKey(element)) {
                int value = map.get(element);
                map.replace(element, ++value);
            } else {
                map.put(element, 1);
            }
        });
        return map;
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
