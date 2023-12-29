package com.blogspot.ostas.leetcode.all.medium.longest_turbulent_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [9,4,2,10,7,8,8,1,9]
    Output: 5
    Explanation: arr[1] > arr[2] < arr[3] > arr[4] < arr[5]
    Example 2:
    Input: arr = [4,8,12,16]
    Output: 2
    Example 3:
    Input: arr = [100]
    Output: 1
      Constraints:
    1 <= arr.length <= 4 * 104
    0 <= arr[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9};
        int expected = 5;
        var result = solution.maxTurbulenceSize(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{4, 8, 12, 16};
        int expected = 2;
        var result = solution.maxTurbulenceSize(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{100};
        int expected = 1;
        var result = solution.maxTurbulenceSize(arr);
        assertThat(result).isEqualTo(expected);
    }

}
