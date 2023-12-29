package com.blogspot.ostas.leetcode.all.easy.teemo_attacking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: timeSeries = [1,4], duration = 2
    Output: 4
    Explanation: Teemo's attacks on Ashe go as follows:
    - At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
    - At second 4, Teemo attacks, and Ashe is poisoned for seconds 4 and 5.
    Ashe is poisoned for seconds 1, 2, 4, and 5, which is 4 seconds in total.
    Example 2:
    Input: timeSeries = [1,2], duration = 2
    Output: 3
    Explanation: Teemo's attacks on Ashe go as follows:
    - At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
    - At second 2 however, Teemo attacks again and resets the poison timer. Ashe is poisoned for seconds 2 and 3.
    Ashe is poisoned for seconds 1, 2, and 3, which is 3 seconds in total.
      Constraints:
    1 <= timeSeries.length <= 104
    0 <= timeSeries[i], duration <= 107
    timeSeries is sorted in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] timeSeries = new int[]{1, 4};
        int duration = 2;
        int expected = 4;
        var result = solution.findPoisonedDuration(timeSeries, duration);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] timeSeries = new int[]{1, 2};
        int duration = 2;
        int expected = 3;
        var result = solution.findPoisonedDuration(timeSeries, duration);
        assertThat(result).isEqualTo(expected);
    }

}
