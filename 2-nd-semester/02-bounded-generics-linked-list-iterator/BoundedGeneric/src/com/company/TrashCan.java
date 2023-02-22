package com.company;

public class TrashCan<T extends Trash> {
    private T[] trash;
    private int size;
    private final double CAPASITY_MULTIPLICATOR = 1.5;

    public TrashCan() {
        trash = (T[]) new Trash[5];
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
        return trash[i];
    }

    /**
     * Метод для вставки элемента в конец
     * @param el элемент
     */
    public void put(T el) {
        if(trash.length <= size) {
            T[] extHumen = (T[]) new Object[(int) (size * CAPASITY_MULTIPLICATOR)];
            for(int i = 0; i < size; i++) {
                extHumen[i] = trash[i];
            }
            trash = extHumen;
        }
        trash[size++] = el;
    }

    public int getSize() {
        return size;
    }

    public double getMass() {
        double sum = 0;
        for(T t: trash) {
            sum += t.getMass();
        }
        return sum;
    }
}
