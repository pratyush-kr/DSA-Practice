package org.algo.datastructures;

public interface LinkedList {
    void print();
    void add(int value);
    void remove(int value);
    int size();
    void reverse();
    boolean search(int value);
    void findIsCyclic();
}
