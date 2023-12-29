package com.blogspot.ostas.leetcode.all.hard.cracking_the_safe;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1, k = 2
    Output: "10"
    Explanation: The password is a single digit, so enter each digit. "01" would also unlock the safe.
    Example 2:
    Input: n = 2, k = 2
    Output: "01100"
    Explanation: For each possible password:
    - "00" is typed in starting from the 4th digit.
    - "01" is typed in starting from the 1st digit.
    - "10" is typed in starting from the 3rd digit.
    - "11" is typed in starting from the 2nd digit.
    Thus "01100" will unlock the safe. "10011", and "11001" would also unlock the safe.
      Constraints:
    1 <= n <= 4
    1 <= k <= 10
    1 <= kn <= 4096
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int k = 2;
        String expected1 = "10";
        String expected2 = "01";
        var result = solution.crackSafe(n, k);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int k = 2;
        String expected1 = "01100";
        String expected2 = "10011";
        String expected3 = "11001";
        String expected4 = "00110";
        var result = solution.crackSafe(n, k);
        assertThat(result).isIn(expected1, expected2, expected3, expected4);
    }

}
