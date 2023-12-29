package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_days_to_eat_n_oranges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 10
    Output: 4
    Explanation: You have 10 oranges.
    Day 1: Eat 1 orange,  10 - 1 = 9.
    Day 2: Eat 6 oranges, 9 - 2*(9/3) = 9 - 6 = 3. (Since 9 is divisible by 3)
    Day 3: Eat 2 oranges, 3 - 2*(3/3) = 3 - 2 = 1.
    Day 4: Eat the last orange  1 - 1  = 0.
    You need at least 4 days to eat the 10 oranges.
    Example 2:
    Input: n = 6
    Output: 3
    Explanation: You have 6 oranges.
    Day 1: Eat 3 oranges, 6 - 6/2 = 6 - 3 = 3. (Since 6 is divisible by 2).
    Day 2: Eat 2 oranges, 3 - 2*(3/3) = 3 - 2 = 1. (Since 3 is divisible by 3)
    Day 3: Eat the last orange  1 - 1  = 0.
    You need at least 3 days to eat the 6 oranges.
      Constraints:
    1 <= n <= 2 * 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 10;
        int expected = 4;
        var result = solution.minDays(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int expected = 3;
        var result = solution.minDays(n);
        assertThat(result).isEqualTo(expected);
    }

}
