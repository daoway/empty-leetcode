package com.blogspot.ostas.leetcode.all.easy.find_the_peaks;

import java.util.ArrayList;
import java.util.List;

/*
      2951. find the peaks

https://leetcode.com/problems/find-the-peaks

You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.
Return an array that consists of indices of peaks in the given array in any order.
Notes:
A peak is defined as an element that is strictly greater than its neighboring elements.
The first and last elements of the array are not a peak.

*/

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                result.add(i);
            }
        }
        return result;
    }
}
