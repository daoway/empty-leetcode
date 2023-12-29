package com.blogspot.ostas.leetcode.all.hard.three_equal_parts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,0,1,0,1]
    Output: [0,3]
    Example 2:
    Input: arr = [1,1,0,1,1]
    Output: [-1,-1]
    Example 3:
    Input: arr = [1,1,0,0,1]
    Output: [0,2]
      Constraints:
    3 <= arr.length <= 3 * 104
    arr[i] is 0 or 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 0, 1, 0, 1};
        int[] expected = new int[]{0, 3};
        var result = solution.threeEqualParts(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 0, 1, 1};
        int[] expected = new int[]{-1, -1};
        var result = solution.threeEqualParts(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 0, 0, 1};
        int[] expected = new int[]{0, 2};
        var result = solution.threeEqualParts(arr);
        assertThat(result).isEqualTo(expected);
    }

}
