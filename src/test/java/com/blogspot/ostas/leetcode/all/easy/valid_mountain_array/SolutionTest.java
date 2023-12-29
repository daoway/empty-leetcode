package com.blogspot.ostas.leetcode.all.easy.valid_mountain_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,1]
    Output: false
    Example 2:
    Input: arr = [3,5,5]
    Output: false
    Example 3:
    Input: arr = [0,3,2,1]
    Output: true
      Constraints:
    1 <= arr.length <= 104
    0 <= arr[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 1};
        boolean expected = false;
        var result = solution.validMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{3, 5, 5};
        boolean expected = false;
        var result = solution.validMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{0, 3, 2, 1};
        boolean expected = true;
        var result = solution.validMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }

}
