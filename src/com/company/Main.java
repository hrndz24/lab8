package com.company;

public class Main {

    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.addElement("new");
        operation.addElement("element");
        operation.addElement("add");
        operation.addElement("please");

        System.out.println(operation.getElements());

        operation.printSortedElementsLengths();

        System.out.println(operation.contains("ease"));
    }
}
