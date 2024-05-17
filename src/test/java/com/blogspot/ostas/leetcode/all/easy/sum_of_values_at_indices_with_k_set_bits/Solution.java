package com.blogspot.ostas.leetcode.all.easy.sum_of_values_at_indices_with_k_set_bits;

import java.util.List;
import java.util.stream.IntStream;

/*
      2859. sum of values at indices with k set bits

https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits

You are given a 0-indexed integer array nums and an integer k.
Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.
The set bits in an integer are the 1's present when it is written in binary.
For example, the binary representation of 21 is 10101, which has 3 set bits.

*/
class Solution {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public int sumIndicesWithKSetBitsX(List<Integer> nums, int k) {
        return IntStream.range(0, nums.size()).filter(idx -> Integer.bitCount(idx) == k).map(nums::get).sum();
    }
}