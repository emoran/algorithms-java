package com.moran;

public class AdjacentElementsProduct {

    public static int solution(int[] inputArray) {
        int len = inputArray.length;
        int max = -10000; // Java Max value for INT

        for (int i = 0; i < len - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > max) {
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        System.out.println("1. Solution: " + max);
        return max;
    }
}
