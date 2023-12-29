package com.blogspot.ostas.leetcode.all.easy.day_of_the_week;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: day = 31, month = 8, year = 2019
    Output: "Saturday"
    Example 2:
    Input: day = 18, month = 7, year = 1999
    Output: "Sunday"
    Example 3:
    Input: day = 15, month = 8, year = 1993
    Output: "Sunday"
      Constraints:
    The given dates are valid dates between the years 1971 and 2100.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int day = 31;
        int month = 8;
        int year = 2019;
        String expected = "Saturday";
        var result = solution.dayOfTheWeek(day, month, year);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int day = 18;
        int month = 7;
        int year = 1999;
        String expected = "Sunday";
        var result = solution.dayOfTheWeek(day, month, year);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int day = 15;
        int month = 8;
        int year = 1993;
        String expected = "Sunday";
        var result = solution.dayOfTheWeek(day, month, year);
        assertThat(result).isEqualTo(expected);
    }

}
