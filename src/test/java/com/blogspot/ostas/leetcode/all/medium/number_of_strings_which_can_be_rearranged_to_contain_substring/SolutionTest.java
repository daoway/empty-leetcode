package com.blogspot.ostas.leetcode.all.medium.number_of_strings_which_can_be_rearranged_to_contain_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: 12
    Explanation: The 12 strings which can be rearranged to have "leet" as a substring are: "eelt", "eetl", "elet", "elte", "etel", "etle", "leet", "lete", "ltee", "teel", "tele", and "tlee".
    Example 2:
    Input: n = 10
    Output: 83943898
    Explanation: The number of strings with length 10 which can be rearranged to have "leet" as a substring is 526083947580. Hence the answer is 526083947580 % (109 + 7) = 83943898.
      Constraints:
    1 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int expected = 12;
        var result = solution.stringCount(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int expected = 83943898;
        var result = solution.stringCount(n);
        assertThat(result).isEqualTo(expected);
    }

}
