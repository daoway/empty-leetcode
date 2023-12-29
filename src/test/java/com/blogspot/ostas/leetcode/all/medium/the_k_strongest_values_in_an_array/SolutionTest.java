package com.blogspot.ostas.leetcode.all.medium.the_k_strongest_values_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,4,5], k = 2
    Output: [5,1]
    Explanation: Median is 3, the elements of the array sorted by the strongest are [5,1,4,2,3]. The strongest 2 elements are [5, 1]. [1, 5] is also accepted answer.
    Please note that although |5 - 3| == |1 - 3| but 5 is stronger than 1 because 5 > 1.
    Example 2:
    Input: arr = [1,1,3,5,5], k = 2
    Output: [5,5]
    Explanation: Median is 3, the elements of the array sorted by the strongest are [5,5,1,1,3]. The strongest 2 elements are [5, 5].
    Example 3:
    Input: arr = [6,7,11,7,6,8], k = 5
    Output: [11,8,6,6,7]
    Explanation: Median is 7, the elements of the array sorted by the strongest are [11,8,6,6,7,7].
    Any permutation of [11,8,6,6,7] is accepted.
      Constraints:
    1 <= arr.length <= 105
    -105 <= arr[i] <= 105
    1 <= k <= arr.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = new int[]{5, 1};
        var result = solution.getStrongest(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 3, 5, 5};
        int k = 2;
        int[] expected = new int[]{5, 5};
        var result = solution.getStrongest(arr, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{6, 7, 11, 7, 6, 8};
        int k = 5;
        int[] expected = new int[]{11, 8, 6, 6, 7};
        var result = solution.getStrongest(arr, k);
        assertThat(result).isEqualTo(expected);
    }

}
