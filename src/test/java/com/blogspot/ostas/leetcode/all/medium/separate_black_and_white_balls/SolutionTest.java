package com.blogspot.ostas.leetcode.all.medium.separate_black_and_white_balls;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "101"
    Output: 1
    Explanation: We can group all the black balls to the right in the following way:
    - Swap s[0] and s[1], s = "011".
    Initially, 1s are not grouped together, requiring at least 1 step to group them to the right.
    Example 2:
    Input: s = "100"
    Output: 2
    Explanation: We can group all the black balls to the right in the following way:
    - Swap s[0] and s[1], s = "010".
    - Swap s[1] and s[2], s = "001".
    It can be proven that the minimum number of steps needed is 2.
    Example 3:
    Input: s = "0111"
    Output: 0
    Explanation: All the black balls are already grouped to the right.
      Constraints:
    1 <= n == s.length <= 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "101";
        long expected = 1;
        var result = solution.minimumSteps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "100";
        long expected = 2;
        var result = solution.minimumSteps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "0111";
        long expected = 0;
        var result = solution.minimumSteps(s);
        assertThat(result).isEqualTo(expected);
    }

}
