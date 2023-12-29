package com.blogspot.ostas.leetcode.all.medium.adding_two_negabinary_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr1 = [1,1,1,1,1], arr2 = [1,0,1]
    Output: [1,0,0,0,0]
    Explanation: arr1 represents 11, arr2 represents 5, the output represents 16.
    Example 2:
    Input: arr1 = [0], arr2 = [0]
    Output: [0]
    Example 3:
    Input: arr1 = [0], arr2 = [1]
    Output: [1]
      Constraints:
    1 <= arr1.length, arr2.length <= 1000
    arr1[i] and arr2[i] are 0 or 1
    arr1 and arr2 have no leading zeros
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr1 = new int[]{1, 1, 1, 1, 1};
        int[] arr2 = new int[]{1, 0, 1};
        int[] expected = new int[]{1, 0, 0, 0, 0};
        var result = solution.addNegabinary(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{0};
        int[] expected = new int[]{0};
        var result = solution.addNegabinary(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1};
        int[] expected = new int[]{1};
        var result = solution.addNegabinary(arr1, arr2);
        assertThat(result).isEqualTo(expected);
    }

}
