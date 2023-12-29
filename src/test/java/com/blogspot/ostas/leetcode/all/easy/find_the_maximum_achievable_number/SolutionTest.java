package com.blogspot.ostas.leetcode.all.easy.find_the_maximum_achievable_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 4, t = 1
    Output: 6
    Explanation: The maximum achievable number is x = 6; it can become equal to num after performing this operation:
    1- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5.
    It can be proven that there is no achievable number larger than 6.
    Example 2:
    Input: num = 3, t = 2
    Output: 7
    Explanation: The maximum achievable number is x = 7; after performing these operations, x will equal num:
    1- Decrease x by 1, and increase num by 1. Now, x = 6 and num = 4.
    2- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5.
    It can be proven that there is no achievable number larger than 7.
      Constraints:
    1 <= num, t <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 4;
        int t = 1;
        int expected = 6;
        var result = solution.theMaximumAchievableX(num, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 3;
        int t = 2;
        int expected = 7;
        var result = solution.theMaximumAchievableX(num, t);
        assertThat(result).isEqualTo(expected);
    }

}
