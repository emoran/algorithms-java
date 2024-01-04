package com.moran;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        int myArray[] = { 3, 6, -2, -5, 7, 3 };

        int test = solution(myArray);
    }

    static int solution(int[] inputArray) {

        int len = inputArray.length;
        int max = -10000;

        // int max = Integer.MAX_VALUE;

        System.out.println("inputArray.length: " + inputArray.length);

        for (int i = 0; i < len - 1; i++) {
            System.out.println("len-1: " + (len - 1));

            System.out.println("inputArray[i]*inputArray[i+1]: " + (inputArray[i] * inputArray[i + 1]));

            System.out.println("max: " + (max));

            if (inputArray[i] * inputArray[i + 1] > max) {
                max = inputArray[i] * inputArray[i + 1];
            }
        }
        return max;
    }

}
