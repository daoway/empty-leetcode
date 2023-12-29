package com.blogspot.ostas.leetcode.all.medium.length_of_longest_fibonacci_subsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,4,5,6,7,8]
    Output: 5
    Explanation: The longest subsequence that is fibonacci-like: [1,2,3,5,8].
    Example 2:
    Input: arr = [1,3,7,11,12,14,18]
    Output: 3
    Explanation: The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].
      Constraints:
    3 <= arr.length <= 1000
    1 <= arr[i] < arr[i + 1] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int expected = 5;
        var result = solution.lenLongestFibSubseq(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 3, 7, 11, 12, 14, 18};
        int expected = 3;
        var result = solution.lenLongestFibSubseq(arr);
        assertThat(result).isEqualTo(expected);
    }

}
