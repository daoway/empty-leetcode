package com.blogspot.ostas.leetcode.all.medium.bitwise_ors_of_subarrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [0]
    Output: 1
    Explanation: There is only one possible result: 0.
    Example 2:
    Input: arr = [1,1,2]
    Output: 3
    Explanation: The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].
    These yield the results 1, 1, 2, 1, 3, 3.
    There are 3 unique values, so the answer is 3.
    Example 3:
    Input: arr = [1,2,4]
    Output: 6
    Explanation: The possible results are 1, 2, 3, 4, 6, and 7.
      Constraints:
    1 <= arr.length <= 5 * 104
    0 <= arr[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{0};
        int expected = 1;
        var result = solution.subarrayBitwiseORs(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 2};
        int expected = 3;
        var result = solution.subarrayBitwiseORs(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 4};
        int expected = 6;
        var result = solution.subarrayBitwiseORs(arr);
        assertThat(result).isEqualTo(expected);
    }

}
