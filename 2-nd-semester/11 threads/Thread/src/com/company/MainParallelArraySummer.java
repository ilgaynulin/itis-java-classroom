package com.company;

public class MainParallelArraySummer {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int numberOfThreads = 5;
        Sum sum = new Sum();

        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for(int i = 0; i < numberOfThreads; i++) {
            Thread newThread = new ArraySumThread(
                    array,
                    (array.length / numberOfThreads) * i,
                    (array.length / numberOfThreads) * (i + 1),
                    sum);
            newThread.start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum.getSum());
    }
}
