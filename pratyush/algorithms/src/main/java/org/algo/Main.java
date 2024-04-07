package org.algo;

import org.algo.datastructures.LinkedList;
import org.algo.datastructures.LinkedListImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList linkedList = new LinkedListImpl();
        linkedList.add(1);
        linkedList.print();
    }
}