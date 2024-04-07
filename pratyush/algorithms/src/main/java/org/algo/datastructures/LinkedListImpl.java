package org.algo.datastructures;

public class LinkedListImpl implements LinkedList {

    private Node<Integer> head;
    private Node<Integer> tail;

    @Override
    public void print() {
        if(head == null || tail == null) {
            System.out.println("[]");
            return;
        }
        if(head == tail) {
            System.out.println("[" + head.getData() + "]");
            return;
        }
        Node<Integer> current = head;
        System.out.print("[" + current.getData());
        current = current.getNext();
        while(current != null) {
            System.out.print(", " + current.getData());
            current = current.getNext();
        }
        System.out.println("]");
    }

    @Override
    public void add(int value) {
        if(head == null) {
            head = new Node<>(value);
            tail = head;
        } else {
            Node<Integer> current = new Node<>(value);
            tail.setNext(current);
            tail = current;
        }
    }

    @Override
    public void remove(int value) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void reverse() {

    }

    @Override
    public boolean search(int value) {
        return false;
    }

    @Override
    public void findIsCyclic() {

    }

    public LinkedListImpl() {
        head = null;
        tail = null;
    }
}
