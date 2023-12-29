package com.blogspot.ostas.leetcode.all.medium.number_of_ways_to_select_buildings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "001101"
    Output: 6
    Explanation:
    The following sets of indices selected are valid:
    - [0,2,4] from "001101" forms "010"
    - [0,3,4] from "001101" forms "010"
    - [1,2,4] from "001101" forms "010"
    - [1,3,4] from "001101" forms "010"
    - [2,4,5] from "001101" forms "101"
    - [3,4,5] from "001101" forms "101"
    No other selection is valid. Thus, there are 6 total ways.
    Example 2:
    Input: s = "11100"
    Output: 0
    Explanation: It can be shown that there are no valid selections.
      Constraints:
    3 <= s.length <= 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "001101";
        long expected = 6;
        var result = solution.numberOfWays(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "11100";
        long expected = 0;
        var result = solution.numberOfWays(s);
        assertThat(result).isEqualTo(expected);
    }

}
