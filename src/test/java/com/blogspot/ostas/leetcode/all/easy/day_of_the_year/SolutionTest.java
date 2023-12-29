package com.blogspot.ostas.leetcode.all.easy.day_of_the_year;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: date = "2019-01-09"
    Output: 9
    Explanation: Given date is the 9th day of the year in 2019.
    Example 2:
    Input: date = "2019-02-10"
    Output: 41
      Constraints:
    date.length == 10
    date[4] == date[7] == '-', and all other date[i]'s are digits
    date represents a calendar date between Jan 1st, 1900 and Dec 31th, 2019.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String date = "2019-01-09";
        int expected = 9;
        var result = solution.dayOfYear(date);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String date = "2019-02-10";
        int expected = 41;
        var result = solution.dayOfYear(date);
        assertThat(result).isEqualTo(expected);
    }

}
