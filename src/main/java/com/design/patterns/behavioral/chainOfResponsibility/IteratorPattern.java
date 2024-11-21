package com.design.patterns.behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPattern {

    public static ArrayList<Integer> createList() {
        return new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
    }

    public static void main(String[] args) {

        ArrayList<Integer> processList = createList();

        System.out.println(processList);

        Iterator<Integer> processIterator = processList.listIterator();
        System.out.println("Removing elements via List");
        //this works
        while (processIterator.hasNext()) {
            //System.out.println(processIterator.next());
            processList.remove(0);
        }
        //this does not work
        /*while (processIterator.hasNext()) {
            //System.out.println(processIterator.next());
            processList.remove(processIterator.next());
        }*/
        System.out.println(processList);

        //using iterator
        ArrayList<Integer> processListUsingIterator = createList();
        processIterator = processListUsingIterator.listIterator();

        System.out.println("Removing elements via Iterator");

        while (processIterator.hasNext()){
            System.out.println(processIterator.next());
            processIterator.remove();
        }
        System.out.println(processList);
    }
}
