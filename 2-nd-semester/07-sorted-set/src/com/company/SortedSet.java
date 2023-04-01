package com.company;

import java.util.Comparator;

public class SortedSet<T> {
    private T[] array;
    private Comparator<T> comparator;
    private int size;

    public SortedSet(Comparator<T> comparator) {
        this.comparator = comparator;
        this.size = 0;
        this.array = (T[]) new Object[16];
    }

    private int binarySearch(int left, int right, T[] arr, T el) {
        int middle = (left + right) / 2;
        if(comparator.compare(arr[middle], el) > 0) {
            right = middle - 1;
        } else if(comparator.compare(arr[middle], el) < 0) {
            left = middle + 1;
        } else {
            return middle;
        }

        if(left > right) {
            return -1;
        }
        return binarySearch(left, right, arr, el);
    }

    private int binarySearch(T[] arr, T el) {
        return binarySearch(0, size - 1, arr, el);
    }

    public void add(T el) {
        if(size == 0) {
            put(0, el);
            size++;
            return;
        }
        if(contains(el)) {
            return;
        } else {
            // получение элемента для вставки
            int indexToInsert = getIndextToInsert(0, size - 1, el);
            put(indexToInsert, el);
            size++;
        }
    }

    private int getIndextToInsert(int left, int right, T el) {
        if(size == 0) {
            return 0;
        }
        if(left == right) {
            if(comparator.compare(array[right], el)  > 0) {
                return right;
            } else {
                return right + 1;
            }
        }
        int middle = (left + right) / 2;
        if(comparator.compare(array[middle], el) > 0) {
            right = middle - 1;
        } else if(comparator.compare(array[middle], el) < 0) {
            left = middle + 1;
        }
        return getIndextToInsert(left, right, el);
    }

    private void put(int index, T el) {
        if(array.length == size) {
            resize();
        }
        for(int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = el;
    }

    public boolean contains(T el) {
        if(binarySearch(array, el) == -1) {
            return false;
        } else {
            return true;
        }
    }

    private void resize() {
        T[] ext = (T[]) new Object[array.length * 2];
        for(int i = 0; i < array.length; i++ ) {
            ext[i] = array[i];
        }
    }
}
