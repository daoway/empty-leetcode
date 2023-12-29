package com.blogspot.ostas.leetcode.all.medium.number_of_sub_arrays_with_odd_sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,3,5]
    Output: 4
    Explanation: All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
    All sub-arrays sum are [1,4,9,3,8,5].
    Odd sums are [1,9,3,5] so the answer is 4.
    Example 2:
    Input: arr = [2,4,6]
    Output: 0
    Explanation: All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
    All sub-arrays sum are [2,6,12,4,10,6].
    All sub-arrays have even sum and the answer is 0.
    Example 3:
    Input: arr = [1,2,3,4,5,6,7]
    Output: 16
      Constraints:
    1 <= arr.length <= 105
    1 <= arr[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 3, 5};
        int expected = 4;
        var result = solution.numOfSubarrays(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{2, 4, 6};
        int expected = 0;
        var result = solution.numOfSubarrays(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int expected = 16;
        var result = solution.numOfSubarrays(arr);
        assertThat(result).isEqualTo(expected);
    }

}
