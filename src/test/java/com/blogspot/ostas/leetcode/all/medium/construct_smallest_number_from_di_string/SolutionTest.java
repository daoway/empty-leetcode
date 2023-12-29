package com.blogspot.ostas.leetcode.all.medium.construct_smallest_number_from_di_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pattern = "IIIDIDDD"
    Output: "123549876"
    Explanation:
    At indices 0, 1, 2, and 4 we must have that num[i] < num[i+1].
    At indices 3, 5, 6, and 7 we must have that num[i] > num[i+1].
    Some possible values of num are "245639871", "135749862", and "123849765".
    It can be proven that "123549876" is the smallest possible num that meets the conditions.
    Note that "123414321" is not possible because the digit '1' is used more than once.
    Example 2:
    Input: pattern = "DDD"
    Output: "4321"
    Explanation:
    Some possible values of num are "9876", "7321", and "8742".
    It can be proven that "4321" is the smallest possible num that meets the conditions.
      Constraints:
    1 <= pattern.length <= 8
    pattern consists of only the letters 'I' and 'D'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String pattern = "IIIDIDDD";
        String expected = "123549876";
        var result = solution.smallestNumber(pattern);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String pattern = "DDD";
        String expected = "4321";
        var result = solution.smallestNumber(pattern);
        assertThat(result).isEqualTo(expected);
    }

}
