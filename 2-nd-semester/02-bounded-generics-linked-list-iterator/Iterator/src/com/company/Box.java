package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Box<T> {
    private T[] objects;
    private int size;

    public Box() {
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

    public T[] getObjects() {
        return objects;
    }

    public Iterator<T> iterator() {
        return new BoxIterator();
    }

    public Iterator<T> iteratorNoneNull() {
        return new BoxIteratorNoneNull();
    }

    private class BoxIterator implements Iterator<T> {
        int currentIndex;

        public BoxIterator() {
            currentIndex = 0;
        }

        public T next() {
            if(currentIndex > size - 1) {
                throw new NoSuchElementException("Вы достигли конца. Элементов больше нет");
            }
            return objects[currentIndex++];
        }

        public boolean hasNext() {
            return currentIndex < size;
        }
    }

    private class BoxIteratorNoneNull implements Iterator<T> {
        int currentIndex;

        public BoxIteratorNoneNull() {
            currentIndex = 0;
        }

        public T next() {
            if(currentIndex > size - 1) {
                throw new NoSuchElementException("Вы достигли конца. Элементов больше нет");
            }
            if(objects[currentIndex] != null) {
                return objects[currentIndex++];
            } else {
                currentIndex++;
                return next();
            }
        }

        public boolean hasNext() {
            if(currentIndex > size) {
                return false;
            }
            if(objects[currentIndex] != null) {
                return true;
            } else {
                currentIndex++;
                return hasNext();
            }
        }
    }
}
