package com.blogspot.ostas.leetcode.all.easy.unique_number_of_occurrences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,2,1,1,3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
    Example 2:
    Input: arr = [1,2]
    Output: false
    Example 3:
    Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
    Output: true
      Constraints:
    1 <= arr.length <= 1000
    -1000 <= arr[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        boolean expected = true;
        var result = solution.uniqueOccurrences(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2};
        boolean expected = false;
        var result = solution.uniqueOccurrences(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        boolean expected = true;
        var result = solution.uniqueOccurrences(arr);
        assertThat(result).isEqualTo(expected);
    }

}
