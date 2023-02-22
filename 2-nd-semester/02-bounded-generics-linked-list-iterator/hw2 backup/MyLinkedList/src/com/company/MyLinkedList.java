package com.company;

import java.util.NoSuchElementException;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;    // Необязательно писать т.к. такие значения вставятся по умолчанию
        size = 0;
    }

    public void add(T el) {
        Node<T> newNode = new Node<>(el, null);
        if(head == null) {
            head = newNode;
        } else {
            Node<T> lastNode = head;
            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
        }
        size++;
    }

    public T get(int index) throws NoSuchElementException {
        if (head == null || index < 0 || index >= size) {
            throw new NoSuchElementException();
        }
        Node<T> current = head;
        while (current != null) {
            if (index == 0) {
                return current.getValue();
            }
            index--;
            current = current.getNext();
        }
        throw new NoSuchElementException();
    }

    public void delete(int index) {
        // дз
    }

    public void put(T el, int index) {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("Вы указали индекс за пределами связного списка");
        }
        if(index == 0) {
            Node<T> newNode = new Node<T>(el, head);
            head = newNode;
            size++;
            return;
        }
        Node<T> current = head;
        while(index > 1) {
            index--;
            current = current.getNext();
        }
        Node<T> next = current.getNext();
        Node<T> newNode = new Node<>(el, next);
        current.setNext(newNode);
        size++;
    }
}
