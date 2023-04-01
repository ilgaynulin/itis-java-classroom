package com.company;

public class Main {

    public static void main(String[] args) {
        SortedSet<Integer> integers = new SortedSet<>((o1, o2) -> o1.compareTo(o2));
        integers.add(10);
        integers.add(8);
        integers.add(9);
        integers.add(4);
        integers.add(10);
        integers.add(1);

    }

    public static int binarySearch(int left, int right, int[] arr, int el) {
        int middle = (left + right) / 2;
        if(arr[middle] > el) {
            right = middle - 1;
        } else if(arr[middle] < el) {
            left = middle + 1;
        } else {
            return middle;
        }

        if(left > right) {
            return -1;
        }
        return binarySearch(left, right, arr, el);
    }

    public static int binarySearch(int[] arr, int el) {
        return binarySearch(0, arr.length - 1, arr, el);
    }
}
