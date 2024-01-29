package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence.naive;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generateSubsequences(int[] arr) {
        List<List<Integer>> allSubsequences = new ArrayList<>();
        generateSubsequencesHelper(arr, 0, new ArrayList<>(), allSubsequences);
        return allSubsequences;
    }

    private void generateSubsequencesHelper(int[] arr, int index, List<Integer> current, List<List<Integer>> allSubsequences) {
        if (index == arr.length) {
            // Base case: add the current subsequence to the result
            allSubsequences.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element
        generateSubsequencesHelper(arr, index + 1, current, allSubsequences);

        // Include the current element
        current.add(arr[index]);
        generateSubsequencesHelper(arr, index + 1, current, allSubsequences);

        // Backtrack to exclude the current element for the next recursive call
        //current.remove(current.size() - 1);
        current.removeLast();
    }

    private boolean isStrictlyIncreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false; // Not strictly increasing
            }
        }
        return true; // Strictly increasing
    }

    public int lengthOfLIS(int[] nums) {
        List<List<Integer>> allSubsequences = generateSubsequences(nums);
        int max = 1;
        for (List<Integer> subsequence : allSubsequences) {
            if (isStrictlyIncreasing(subsequence)) {
                max = Math.max(max, subsequence.size());
            }
        }
        return max;
    }
}
