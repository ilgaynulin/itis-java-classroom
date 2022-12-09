package com.company;

public interface Sortable {
    /**
     * Сортирует массив
     */
    void sort();

    /**
     * Получает массив
     * @return
     */
    int[] getArray();

    /**
     * Устанавливает массив
     * @param array
     */
    void setArray(int[] array);
}
