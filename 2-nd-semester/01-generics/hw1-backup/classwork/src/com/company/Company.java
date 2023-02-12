package com.company;

public class Company<T> {
    private T[] objects;

    private int size;

    public Company() {
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
            T[] extHumen = (T[]) new Object[(int) (size * 1.5)];
            for(int i = 0; i < size; i++) {
                extHumen[i] = objects[i];
            }
            objects = extHumen;
        }
        objects[size++] = el;
    }

    public int getSize() {
        return size;
    }
}
