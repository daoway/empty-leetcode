package com.blogspot.ostas.leetcode.all.easy.number_of_days_between_two_dates;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: date1 = "2019-06-29", date2 = "2019-06-30"
    Output: 1
    Example 2:
    Input: date1 = "2020-01-15", date2 = "2019-12-31"
    Output: 15
      Constraints:
    The given dates are valid dates between the years 1971 and 2100.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String date1 = "2019-06-29";
        String date2 = "2019-06-30";
        int expected = 1;
        var result = solution.daysBetweenDates(date1, date2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String date1 = "2020-01-15";
        String date2 = "2019-12-31";
        int expected = 15;
        var result = solution.daysBetweenDates(date1, date2);
        assertThat(result).isEqualTo(expected);
    }

}
