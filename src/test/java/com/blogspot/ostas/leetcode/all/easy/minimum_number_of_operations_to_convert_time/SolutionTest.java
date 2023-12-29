package com.blogspot.ostas.leetcode.all.easy.minimum_number_of_operations_to_convert_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: current = "02:30", correct = "04:35"
    Output: 3
    Explanation:
    We can convert current to correct in 3 operations as follows:
    - Add 60 minutes to current. current becomes "03:30".
    - Add 60 minutes to current. current becomes "04:30".
    - Add 5 minutes to current. current becomes "04:35".
    It can be proven that it is not possible to convert current to correct in fewer than 3 operations.
    Example 2:
    Input: current = "11:00", correct = "11:01"
    Output: 1
    Explanation: We only have to add one minute to current, so the minimum number of operations needed is 1.
      Constraints:
    current and correct are in the format "HH:MM"
    current <= correct
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String current = "02:30";
        String correct = "04:35";
        int expected = 3;
        var result = solution.convertTime(current, correct);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String current = "11:00";
        String correct = "11:01";
        int expected = 1;
        var result = solution.convertTime(current, correct);
        assertThat(result).isEqualTo(expected);
    }

}
