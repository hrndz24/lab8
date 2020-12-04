package com.company;

public class Main {

    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.add("new");
        operation.add("element");
        operation.add("add");
        operation.add("please");

        System.out.println(operation.getElements());

        operation.printSortedElementsLengths();

        System.out.println(operation.contains("ease"));

        System.out.println(operation.compareInnerObjects(1, 3));
    }
}
