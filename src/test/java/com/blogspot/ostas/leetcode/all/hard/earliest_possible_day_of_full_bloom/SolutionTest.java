package com.blogspot.ostas.leetcode.all.hard.earliest_possible_day_of_full_bloom;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: plantTime = [1,4,3], growTime = [2,3,1]
    Output: 9
    Explanation: The grayed out pots represent planting days, colored pots represent growing days, and the flower represents the day it blooms.
    One optimal way is:
    On day 0, plant the 0th seed. The seed grows for 2 full days and blooms on day 3.
    On days 1, 2, 3, and 4, plant the 1st seed. The seed grows for 3 full days and blooms on day 8.
    On days 5, 6, and 7, plant the 2nd seed. The seed grows for 1 full day and blooms on day 9.
    Thus, on day 9, all the seeds are blooming.
    Example 2:
    Input: plantTime = [1,2,3,2], growTime = [2,1,2,1]
    Output: 9
    Explanation: The grayed out pots represent planting days, colored pots represent growing days, and the flower represents the day it blooms.
    One optimal way is:
    On day 1, plant the 0th seed. The seed grows for 2 full days and blooms on day 4.
    On days 0 and 3, plant the 1st seed. The seed grows for 1 full day and blooms on day 5.
    On days 2, 4, and 5, plant the 2nd seed. The seed grows for 2 full days and blooms on day 8.
    On days 6 and 7, plant the 3rd seed. The seed grows for 1 full day and blooms on day 9.
    Thus, on day 9, all the seeds are blooming.
    Example 3:
    Input: plantTime = [1], growTime = [1]
    Output: 2
    Explanation: On day 0, plant the 0th seed. The seed grows for 1 full day and blooms on day 2.
    Thus, on day 2, all the seeds are blooming.
      Constraints:
    n == plantTime.length == growTime.length
    1 <= n <= 105
    1 <= plantTime[i], growTime[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] plantTime = new int[]{1, 4, 3};
        int[] growTime = new int[]{2, 3, 1};
        int expected = 9;
        var result = solution.earliestFullBloom(plantTime, growTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] plantTime = new int[]{1, 2, 3, 2};
        int[] growTime = new int[]{2, 1, 2, 1};
        int expected = 9;
        var result = solution.earliestFullBloom(plantTime, growTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] plantTime = new int[]{1};
        int[] growTime = new int[]{1};
        int expected = 2;
        var result = solution.earliestFullBloom(plantTime, growTime);
        assertThat(result).isEqualTo(expected);
    }

}
