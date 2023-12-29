package com.blogspot.ostas.leetcode.all.easy.detect_pattern_of_length_m_repeated_k_or_more_times;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,4,4,4,4], m = 1, k = 3
    Output: true
    Explanation: The pattern (4) of length 1 is repeated 4 consecutive times. Notice that pattern can be repeated k or more times but not less.
    Example 2:
    Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
    Output: true
    Explanation: The pattern (1,2) of length 2 is repeated 2 consecutive times. Another valid pattern (2,1) is also repeated 2 times.
    Example 3:
    Input: arr = [1,2,1,2,1,3], m = 2, k = 3
    Output: false
    Explanation: The pattern (1,2) is of length 2 but is repeated only 2 times. There is no pattern of length 2 that is repeated 3 or more times.
      Constraints:
    2 <= arr.length <= 100
    1 <= arr[i] <= 100
    1 <= m <= 100
    2 <= k <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 4, 4, 4, 4};
        int m = 1;
        int k = 3;
        boolean expected = true;
        var result = solution.containsPattern(arr, m, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 1, 2, 1, 1, 1, 3};
        int m = 2;
        int k = 2;
        boolean expected = true;
        var result = solution.containsPattern(arr, m, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 1, 2, 1, 3};
        int m = 2;
        int k = 3;
        boolean expected = false;
        var result = solution.containsPattern(arr, m, k);
        assertThat(result).isEqualTo(expected);
    }

}
