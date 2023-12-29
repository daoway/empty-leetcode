package com.blogspot.ostas.leetcode.all.hard.minimum_operations_to_make_the_array_k_increasing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [5,4,3,2,1], k = 1
    Output: 4
    Explanation:
    For k = 1, the resultant array has to be non-decreasing.
    Some of the K-increasing arrays that can be formed are [5,6,7,8,9], [1,1,1,1,1], [2,2,3,4,4]. All of them require 4 operations.
    It is suboptimal to change the array to, for example, [6,7,8,9,10] because it would take 5 operations.
    It can be shown that we cannot make the array K-increasing in less than 4 operations.
    Example 2:
    Input: arr = [4,1,5,2,6,2], k = 2
    Output: 0
    Explanation:
    This is the same example as the one in the problem description.
    Here, for every index i where 2 <= i <= 5, arr[i-2] <= arr[i].
    Since the given array is already K-increasing, we do not need to perform any operations.
    Example 3:
    Input: arr = [4,1,5,2,6,2], k = 3
    Output: 2
    Explanation:
    Indices 3 and 5 are the only ones not satisfying arr[i-3] <= arr[i] for 3 <= i <= 5.
    One of the ways we can make the array K-increasing is by changing arr[3] to 4 and arr[5] to 5.
    The array will now be [4,1,5,4,6,5].
    Note that there can be other ways to make the array K-increasing, but none of them require less than 2 operations.
      Constraints:
    1 <= arr.length <= 105
    1 <= arr[i], k <= arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{5, 4, 3, 2, 1};
        int k = 1;
        int expected = 4;
        var result = solution.kIncreasing(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{4, 1, 5, 2, 6, 2};
        int k = 2;
        int expected = 0;
        var result = solution.kIncreasing(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{4, 1, 5, 2, 6, 2};
        int k = 3;
        int expected = 2;
        var result = solution.kIncreasing(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
