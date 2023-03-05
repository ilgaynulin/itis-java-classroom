package com.company;

public class Node<K, V> {
    private Entry<K, V> value;
    private Node<K, V> next;

    public Node(Entry<K, V> value, Node<K, V> next) {
        this.value = value;
        this.next = next;
    }

    public Entry getValue() {
        return value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }
}
