package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_integers_to_choose_from_a_range_i;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: banned = [1,6,5], n = 5, maxSum = 6
    Output: 2
    Explanation: You can choose the integers 2 and 4.
    2 and 4 are from the range [1, 5], both did not appear in banned, and their sum is 6, which did not exceed maxSum.
    Example 2:
    Input: banned = [1,2,3,4,5,6,7], n = 8, maxSum = 1
    Output: 0
    Explanation: You cannot choose any integer while following the mentioned conditions.
    Example 3:
    Input: banned = [11], n = 7, maxSum = 50
    Output: 7
    Explanation: You can choose the integers 1, 2, 3, 4, 5, 6, and 7.
    They are from the range [1, 7], all did not appear in banned, and their sum is 28, which did not exceed maxSum.
      Constraints:
    1 <= banned.length <= 104
    1 <= banned[i], n <= 104
    1 <= maxSum <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] banned = new int[]{1, 6, 5};
        int n = 5;
        int maxSum = 6;
        int expected = 2;
        var result = solution.maxCount(banned, n, maxSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] banned = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = 8;
        int maxSum = 1;
        int expected = 0;
        var result = solution.maxCount(banned, n, maxSum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] banned = new int[]{11};
        int n = 7;
        int maxSum = 50;
        int expected = 7;
        var result = solution.maxCount(banned, n, maxSum);
        assertThat(result).isEqualTo(expected);
    }

}
