package com.blogspot.ostas.leetcode.all.easy.count_distinct_numbers_on_board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 4
    Explanation: Initially, 5 is present on the board.
    The next day, 2 and 4 will be added since 5 % 2 == 1 and 5 % 4 == 1.
    After that day, 3 will be added to the board because 4 % 3 == 1.
    At the end of a billion days, the distinct numbers on the board will be 2, 3, 4, and 5.
    Example 2:
    Input: n = 3
    Output: 2
    Explanation:
    Since 3 % 2 == 1, 2 will be added to the board.
    After a billion days, the only two distinct numbers on the board are 2 and 3.
      Constraints:
    1 <= n <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 4;
        var result = solution.distinctIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int expected = 2;
        var result = solution.distinctIntegers(n);
        assertThat(result).isEqualTo(expected);
    }

}
