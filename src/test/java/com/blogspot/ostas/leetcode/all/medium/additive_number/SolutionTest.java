package com.blogspot.ostas.leetcode.all.medium.additive_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: "112358"
    Output: true
    Explanation:
    The digits can form an additive sequence: 1, 1, 2, 3, 5, 8.
    1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
    Example 2:
    Input: "199100199"
    Output: true
    Explanation:
    The additive sequence is: 1, 99, 100, 199.
    1 + 99 = 100, 99 + 100 = 199
      Constraints:
    1 <= num.length <= 35
    num consists only of digits.
      Follow up: How would you handle overflow for very large input integers?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "112358";
        boolean expected = true;
        var result = solution.isAdditiveNumber(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "199100199";
        boolean expected = true;
        var result = solution.isAdditiveNumber(num);
        assertThat(result).isEqualTo(expected);
    }

}
