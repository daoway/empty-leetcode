package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_frogs_croaking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: croakOfFrogs = "croakcroak"
    Output: 1
    Explanation: One frog yelling "croak" twice.
    Example 2:
    Input: croakOfFrogs = "crcoakroak"
    Output: 2
    Explanation: The minimum number of frogs is two.
    The first frog could yell "crcoakroak".
    The second frog could yell later "crcoakroak".
    Example 3:
    Input: croakOfFrogs = "croakcrook"
    Output: -1
    Explanation: The given string is an invalid combination of "croak" from different frogs.
      Constraints:
    1 <= croakOfFrogs.length <= 105
    croakOfFrogs is either 'c', 'r', 'o', 'a', or 'k'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String croakOfFrogs = "croakcroak";
        int expected = 1;
        var result = solution.minNumberOfFrogs(croakOfFrogs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String croakOfFrogs = "crcoakroak";
        int expected = 2;
        var result = solution.minNumberOfFrogs(croakOfFrogs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String croakOfFrogs = "croakcrook";
        int expected = -1;
        var result = solution.minNumberOfFrogs(croakOfFrogs);
        assertThat(result).isEqualTo(expected);
    }

}
