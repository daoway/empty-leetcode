package com.blogspot.ostas.leetcode.all.medium.previous_permutation_with_one_swap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [3,2,1]
    Output: [3,1,2]
    Explanation: Swapping 2 and 1.
    Example 2:
    Input: arr = [1,1,5]
    Output: [1,1,5]
    Explanation: This is already the smallest permutation.
    Example 3:
    Input: arr = [1,9,4,6,7]
    Output: [1,7,4,6,9]
    Explanation: Swapping 9 and 7.
      Constraints:
    1 <= arr.length <= 104
    1 <= arr[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{3, 2, 1};
        int[] expected = new int[]{3, 1, 2};
        var result = solution.prevPermOpt1(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 5};
        int[] expected = new int[]{1, 1, 5};
        var result = solution.prevPermOpt1(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 9, 4, 6, 7};
        int[] expected = new int[]{1, 7, 4, 6, 9};
        var result = solution.prevPermOpt1(arr);
        assertThat(result).isEqualTo(expected);
    }

}
