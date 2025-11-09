package Dailywork;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70, 80};

        int l1 = arr1.length;
        int l2 = arr2.length;

        int[] merged = new int[l1 + l2];
        for (int i = 0; i < l1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < l2; i++) {
            merged[l1 + i] = arr2[i];
        }

        System.out.println(Arrays.toString(merged));
    }
}
