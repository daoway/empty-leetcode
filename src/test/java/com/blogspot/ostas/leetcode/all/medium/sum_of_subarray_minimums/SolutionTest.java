package com.blogspot.ostas.leetcode.all.medium.sum_of_subarray_minimums;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,1,2,4]
    Output: 17
    Explanation:
    Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
    Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
    Sum is 17.
    Example 2:
    Input: arr = [11,81,94,43,3]
    Output: 444
      Constraints:
    1 <= arr.length <= 3 * 104
    1 <= arr[i] <= 3 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 1, 2, 4};
        int expected = 17;
        var result = solution.sumSubarrayMins(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{11, 81, 94, 43, 3};
        int expected = 444;
        var result = solution.sumSubarrayMins(arr);
        assertThat(result).isEqualTo(expected);
    }

}
