package com.blogspot.ostas.leetcode.all.easy.count_good_triplets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
    Output: 4
    Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
    Example 2:
    Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
    Output: 0
    Explanation: No triplet satisfies all conditions.
      Constraints:
    3 <= arr.length <= 100
    0 <= arr[i] <= 1000
    0 <= a, b, c <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;
        int expected = 4;
        var result = solution.countGoodTriplets(arr, a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 2, 2, 3};
        int a = 0;
        int b = 0;
        int c = 1;
        int expected = 0;
        var result = solution.countGoodTriplets(arr, a, b, c);
        assertThat(result).isEqualTo(expected);
    }

}
