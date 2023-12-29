package com.blogspot.ostas.leetcode.all.medium.count_good_meals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: deliciousness = [1,3,5,7,9]
    Output: 4
    Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
    Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.
    Example 2:
    Input: deliciousness = [1,1,1,3,3,3,7]
    Output: 15
    Explanation: The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.
      Constraints:
    1 <= deliciousness.length <= 105
    0 <= deliciousness[i] <= 220
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] deliciousness = new int[]{1, 3, 5, 7, 9};
        int expected = 4;
        var result = solution.countPairs(deliciousness);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] deliciousness = new int[]{1, 1, 1, 3, 3, 3, 7};
        int expected = 15;
        var result = solution.countPairs(deliciousness);
        assertThat(result).isEqualTo(expected);
    }

}
