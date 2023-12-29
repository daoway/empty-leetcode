package com.blogspot.ostas.leetcode.all.medium.count_triplets_that_can_form_two_arrays_of_equal_xor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [2,3,1,6,7]
    Output: 4
    Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)
    Example 2:
    Input: arr = [1,1,1,1,1]
    Output: 10
      Constraints:
    1 <= arr.length <= 300
    1 <= arr[i] <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{2, 3, 1, 6, 7};
        int expected = 4;
        var result = solution.countTriplets(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 1, 1, 1, 1};
        int expected = 10;
        var result = solution.countTriplets(arr);
        assertThat(result).isEqualTo(expected);
    }

}
