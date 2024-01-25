package com.blogspot.ostas.leetcode.all.medium.number_of_steps_to_reduce_a_number_in_binary_representation_to_one;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "1101"
    Output: 6
    Explanation: "1101" corressponds to number 13 in their decimal representation.
    Step 1) 13 is odd, add 1 and obtain 14.
    Step 2) 14 is even, divide by 2 and obtain 7.
    Step 3) 7 is odd, add 1 and obtain 8.
    Step 4) 8 is even, divide by 2 and obtain 4.
    Step 5) 4 is even, divide by 2 and obtain 2.
    Step 6) 2 is even, divide by 2 and obtain 1.
    Example 2:
    Input: s = "10"
    Output: 1
    Explanation: "10" corressponds to number 2 in their decimal representation.
    Step 1) 2 is even, divide by 2 and obtain 1.
    Example 3:
    Input: s = "1"
    Output: 0
      Constraints:
    1 <= s.length <= 500
    s consists of characters '0' or '1'
    s[0] == '1'
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "1101";
        int expected = 6;
        var result = solution.numSteps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "10";
        int expected = 1;
        var result = solution.numSteps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1";
        int expected = 0;
        var result = solution.numSteps(s);
        assertThat(result).isEqualTo(expected);
    }

}
