package com.company;

public class MyHashMap<K, V> {
    Node<K, V>[] buckets;

    private final int BUCKET_SIZE = 16;

    public MyHashMap() {
        this.buckets = new Node[BUCKET_SIZE];
    }

    public void put(K key, V value) {
        int bucketIndex = key.hashCode() & (BUCKET_SIZE - 1);
        Entry<K,V> newEntry = new Entry<>(key, value);
        Node<K, V> bucketNode = buckets[bucketIndex];
        if(bucketNode == null) {
            buckets[bucketIndex] = new Node<>(newEntry, null);
        } else {
            while (bucketNode != null) {
                Entry<K, V> currentEntry = bucketNode.getValue();
                if(currentEntry.getKey().equals(key)) {
                    currentEntry.setValue(value);
                    break;
                }
                if(bucketNode.getNext() == null) {
                    bucketNode.setNext(new Node<>(newEntry, null));
                }
                bucketNode = bucketNode.getNext();
            }
        }
    }
}
