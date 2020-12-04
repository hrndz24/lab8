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

    public List<String> getReversedElements() {
        List<String> reversed = new ArrayList<>();
        arrayList.forEach(element -> {
            reversed.add(new StringBuilder(element).reverse().toString());
        });
        return reversed;
    }

    public Map<String, Map<Character, Integer>> getCharacterStatistics() {
        Map<String, Map<Character, Integer>> statistics = new HashMap<>();
        arrayList.forEach(element -> {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : element.toCharArray()) {
                if (map.containsKey(c)) {
                    int value = map.get(c);
                    map.replace(c, ++value);
                } else {
                    map.put(c, 1);
                }
            }
            statistics.put(element, map);
        });
        return statistics;
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
