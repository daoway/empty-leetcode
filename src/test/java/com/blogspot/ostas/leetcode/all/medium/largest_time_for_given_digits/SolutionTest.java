package com.blogspot.ostas.leetcode.all.medium.largest_time_for_given_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: arr = [1,2,3,4]
    Output: "23:41"
    Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.
    Example 2:
    Input: arr = [5,5,5,5]
    Output: ""
    Explanation: There are no valid 24-hour times as "55:55" is not valid.
      Constraints:
    arr.length == 4
    0 <= arr[i] <= 9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4};
        String expected = "23:41";
        var result = solution.largestTimeFromDigits(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] arr = new int[]{5, 5, 5, 5};
        String expected = "";
        var result = solution.largestTimeFromDigits(arr);
        assertThat(result).isEqualTo(expected);
    }

}
