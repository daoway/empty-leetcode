package com.blogspot.ostas.leetcode.all.hard.couples_holding_hands;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: row = [0,2,1,3]
    Output: 1
    Explanation: We only need to swap the second (row[1]) and third (row[2]) person.
    Example 2:
    Input: row = [3,2,0,1]
    Output: 0
    Explanation: All couples are already seated side by side.
      Constraints:
    2n == row.length
    2 <= n <= 30
    n is even.
    0 <= row[i] < 2n
    All the elements of row are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] row = new int[]{0, 2, 1, 3};
        int expected = 1;
        var result = solution.minSwapsCouples(row);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] row = new int[]{3, 2, 0, 1};
        int expected = 0;
        var result = solution.minSwapsCouples(row);
        assertThat(result).isEqualTo(expected);
    }

}
