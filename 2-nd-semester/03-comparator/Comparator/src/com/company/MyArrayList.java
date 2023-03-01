package com.company;

import java.util.Comparator;

public class MyArrayList<T> {
    private T[] objects;
    private int size;
    private final double CAPACITY_INCREASE_FACTOR = 1.5;

    public MyArrayList() {
        objects = (T[]) new Object[5];
        this.size = 0;
    }

    /**
     * Метод для получения элемента (Человека) по индексу
     * @param i индекс
     * @return человека по индексу
     */
    public T get(int i) {
        if(i > size || i < 0) {
            throw new IndexOutOfBoundsException(
                    "Не существует объекта по такому индексу"
            );
        }
        return objects[i];
    }

    /**
     * Метод для вставки элемента в конец
     * @param el элемент
     */
    public void put(T el) {
        if(objects.length <= size) {
            increaseArrayCapacity();
        }
        objects[size++] = el;
    }

    public int getSize() {
        return size;
    }

    public void putFirst(T el) {
        if(size > objects.length) {
            increaseArrayCapacity();
        }
        for(int i = size; i > 0; i--) {
            objects[i] = objects[i-1];
        }
        objects[0] = el;
        size++;
    }

    public void printAll() {
        for(int i = 0; i < size; i++) {
            System.out.print(objects[i] + ", ");
        }
        System.out.println();
    }

    public void delete(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Индекс за пределами возможных значений");
        }
        for(int i = index; i < size - 1; i++) {
            objects[i] = objects[i+1];
        }
        objects[size - 1] = null;
        size--;
    }

    public void replace(int index, T el) {

    }

    public void put(int index, T el) {
        //
    }

    private void increaseArrayCapacity() {
        T[] extHuman = (T[]) new Object[(int) (size * CAPACITY_INCREASE_FACTOR)];
        for(int i = 0; i < size; i++) {
            extHuman[i] = objects[i];
        }
        objects = extHuman;
    }

    public void sort(Comparator<T> comparator) {
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(comparator.compare(objects[j], objects[j+1]) > 0) {
                    T t = objects[j + 1];
                    objects[j + 1] = objects[j];
                    objects[j] = t;
                }
            }
        }
    }
}
