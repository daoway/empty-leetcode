package com.blogspot.ostas.leetcode.all.medium.peak_index_in_a_mountain_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [0,1,0]
    Output: 1
    Example 2:
    Input: arr = [0,2,1,0]
    Output: 1
    Example 3:
    Input: arr = [0,10,5,2]
    Output: 1
      Constraints:
    3 <= arr.length <= 105
    0 <= arr[i] <= 106
    arr is guaranteed to be a mountain array.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{0, 1, 0};
        int expected = 1;
        var result = solution.peakIndexInMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{0, 2, 1, 0};
        int expected = 1;
        var result = solution.peakIndexInMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{0, 10, 5, 2};
        int expected = 1;
        var result = solution.peakIndexInMountainArray(arr);
        assertThat(result).isEqualTo(expected);
    }

}
