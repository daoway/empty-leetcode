package com.blogspot.ostas.leetcode.all.medium.next_greater_numerically_balanced_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 22
    Explanation:
    22 is numerically balanced since:
    - The digit 2 occurs 2 times.
    It is also the smallest numerically balanced number strictly greater than 1.
    Example 2:
    Input: n = 1000
    Output: 1333
    Explanation:
    1333 is numerically balanced since:
    - The digit 1 occurs 1 time.
    - The digit 3 occurs 3 times.
    It is also the smallest numerically balanced number strictly greater than 1000.
    Note that 1022 cannot be the answer because 0 appeared more than 0 times.
    Example 3:
    Input: n = 3000
    Output: 3133
    Explanation:
    3133 is numerically balanced since:
    - The digit 1 occurs 1 time.
    - The digit 3 occurs 3 times.
    It is also the smallest numerically balanced number strictly greater than 3000.
      Constraints:
    0 <= n <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 22;
        var result = solution.nextBeautifulNumber(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1000;
        int expected = 1333;
        var result = solution.nextBeautifulNumber(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3000;
        int expected = 3133;
        var result = solution.nextBeautifulNumber(n);
        assertThat(result).isEqualTo(expected);
    }

}
