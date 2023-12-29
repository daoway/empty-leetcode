package com.blogspot.ostas.leetcode.all.medium.minimum_cost_to_make_all_characters_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0011"
    Output: 2
    Explanation: Apply the second operation with i = 2 to obtain s = "0000" for a cost of 2. It can be shown that 2 is the minimum cost to make all characters equal.
    Example 2:
    Input: s = "010101"
    Output: 9
    Explanation: Apply the first operation with i = 2 to obtain s = "101101" for a cost of 3.
    Apply the first operation with i = 1 to obtain s = "011101" for a cost of 2.
    Apply the first operation with i = 0 to obtain s = "111101" for a cost of 1.
    Apply the second operation with i = 4 to obtain s = "111110" for a cost of 2.
    Apply the second operation with i = 5 to obtain s = "111111" for a cost of 1.
    The total cost to make all characters equal is 9. It can be shown that 9 is the minimum cost to make all characters equal.
      Constraints:
    1 <= s.length == n <= 105
    s[i] is either '0' or '1'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0011";
        long expected = 2;
        var result = solution.minimumCost(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "010101";
        long expected = 9;
        var result = solution.minimumCost(s);
        assertThat(result).isEqualTo(expected);
    }

}
