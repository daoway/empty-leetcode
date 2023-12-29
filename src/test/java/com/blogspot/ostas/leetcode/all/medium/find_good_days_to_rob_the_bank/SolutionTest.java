package com.blogspot.ostas.leetcode.all.medium.find_good_days_to_rob_the_bank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: security = [5,3,3,3,5,6,2], time = 2
    Output: [2,3]
    Explanation:
    On day 2, we have security[0] >= security[1] >= security[2] <= security[3] <= security[4].
    On day 3, we have security[1] >= security[2] >= security[3] <= security[4] <= security[5].
    No other days satisfy this condition, so days 2 and 3 are the only good days to rob the bank.
    Example 2:
    Input: security = [1,1,1,1,1], time = 0
    Output: [0,1,2,3,4]
    Explanation:
    Since time equals 0, every day is a good day to rob the bank, so return every day.
    Example 3:
    Input: security = [1,2,3,4,5,6], time = 2
    Output: []
    Explanation:
    No day has 2 days before it that have a non-increasing number of guards.
    Thus, no day is a good day to rob the bank, so return an empty list.
      Constraints:
    1 <= security.length <= 105
    0 <= security[i], time <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] security = new int[]{5, 3, 3, 3, 5, 6, 2};
        int time = 2;
        List<Integer> expected = List.of(2, 3);
        var result = solution.goodDaysToRobBank(security, time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] security = new int[]{1, 1, 1, 1, 1};
        int time = 0;
        List<Integer> expected = List.of(0, 1, 2, 3, 4);
        var result = solution.goodDaysToRobBank(security, time);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] security = new int[]{1, 2, 3, 4, 5, 6};
        int time = 2;
        List<Integer> expected = List.of();
        var result = solution.goodDaysToRobBank(security, time);
        assertThat(result).isEqualTo(expected);
    }

}
