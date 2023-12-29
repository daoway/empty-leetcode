package com.blogspot.ostas.leetcode.all.easy.element_appearing_more_than_two_five_in_sorted_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,2,6,6,6,6,7,10]
    Output: 6
    Example 2:
    Input: arr = [1,1]
    Output: 1
      Constraints:
    1 <= arr.length <= 104
    0 <= arr[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10};
        int expected = 6;
        var result = solution.findSpecialInteger(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1};
        int expected = 1;
        var result = solution.findSpecialInteger(arr);
        assertThat(result).isEqualTo(expected);
    }

}
