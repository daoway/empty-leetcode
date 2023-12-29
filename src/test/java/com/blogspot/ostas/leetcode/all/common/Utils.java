package com.blogspot.ostas.leetcode.all.common;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {
    public static double round(double result) {
        return BigDecimal.valueOf(result).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }


    public static List<int[]> generatePermutations(int[] array) {
        List<int[]> permutations = new ArrayList<>();
        generatePermutationsHelper(array, 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(int[] array, int index, List<int[]> permutations) {
        if (index == array.length - 1) {
            permutations.add(Arrays.copyOf(array, array.length));
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, index, i);
            generatePermutationsHelper(array, index + 1, permutations);
            swap(array, index, i); // Backtrack
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printPermutations(List<int[]> permutations) {
        for (int[] permutation : permutations) {
            System.out.println(Arrays.toString(permutation).replace("[","{").replace("]","}"));
        }
    }
}
