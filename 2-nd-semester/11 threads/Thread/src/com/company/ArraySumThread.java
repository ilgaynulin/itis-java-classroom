package com.company;

public class ArraySumThread extends Thread {
    private int[] array;
    private int startIndex;
    private int endIndex;
    private Sum sum;

    public ArraySumThread(int[] array, int startIndex, int endIndex, Sum sum) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.sum = sum;
    }

    @Override
    public void run() {
        int sumTemp = 0;
        for(int i = startIndex; i < endIndex; i++) {
            sumTemp += array[i];
        }
        synchronized (sum) {
            sum.setSum(sum.getSum() + sumTemp);
        }
    }
}
