package com.blogspot.ostas.leetcode.all.easy.number_of_different_integers_in_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "a123bc34d8ef34"
    Output: 3
    Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
    Example 2:
    Input: word = "leet1234code234"
    Output: 2
    Example 3:
    Input: word = "a1b01c001"
    Output: 1
    Explanation: The three integers "1", "01", and "001" all represent the same integer because
    the leading zeros are ignored when comparing their decimal values.
      Constraints:
    1 <= word.length <= 1000
    word consists of digits and lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "a123bc34d8ef34";
        int expected = 3;
        var result = solution.numDifferentIntegers(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "leet1234code234";
        int expected = 2;
        var result = solution.numDifferentIntegers(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "a1b01c001";
        int expected = 1;
        var result = solution.numDifferentIntegers(word);
        assertThat(result).isEqualTo(expected);
    }

}
