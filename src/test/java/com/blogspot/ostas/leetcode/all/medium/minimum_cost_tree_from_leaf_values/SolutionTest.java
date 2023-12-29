package com.blogspot.ostas.leetcode.all.medium.minimum_cost_tree_from_leaf_values;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [6,2,4]
    Output: 32
    Explanation: There are two possible trees shown.
    The first has a non-leaf node sum 36, and the second has non-leaf node sum 32.
    Example 2:
    Input: arr = [4,11]
    Output: 44
      Constraints:
    2 <= arr.length <= 40
    1 <= arr[i] <= 15
    It is guaranteed that the answer fits into a 32-bit signed integer (i.e., it is less than 231).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{6, 2, 4};
        int expected = 32;
        var result = solution.mctFromLeafValues(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{4, 11};
        int expected = 44;
        var result = solution.mctFromLeafValues(arr);
        assertThat(result).isEqualTo(expected);
    }

}
