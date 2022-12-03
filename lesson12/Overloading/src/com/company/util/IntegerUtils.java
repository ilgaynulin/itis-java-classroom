package com.company.util;

public class IntegerUtils {
    public static int max(int i1, int i2) {
        if(i1 > i2) {
            return i1;
        }
        return i2;
    }

    public static int max(int i1, int i2, int i3) {
        int max = i1;
        if(max < i2) {
            max = i2;
        }
        if(max < i3) {
            max = i3;
        }
        return max;
    }

    public static int max(int ... nums) {
        int max = nums[0];
        for(int num : nums) {
            if(max < num) {
                max = num;
            }
        }
        return max;
    }

}
