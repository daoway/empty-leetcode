package com.blogspot.ostas.leetcode.all.medium.minimum_time_to_complete_trips;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: time = [1,2,3], totalTrips = 5
    Output: 3
    Explanation:
    - At time t = 1, the number of trips completed by each bus are [1,0,0].
      The total number of trips completed is 1 + 0 + 0 = 1.
    - At time t = 2, the number of trips completed by each bus are [2,1,0].
      The total number of trips completed is 2 + 1 + 0 = 3.
    - At time t = 3, the number of trips completed by each bus are [3,1,1].
      The total number of trips completed is 3 + 1 + 1 = 5.
    So the minimum time needed for all buses to complete at least 5 trips is 3.
    Example 2:
    Input: time = [2], totalTrips = 1
    Output: 2
    Explanation:
    There is only one bus, and it will complete its first trip at t = 2.
    So the minimum time needed to complete 1 trip is 2.
      Constraints:
    1 <= time.length <= 105
    1 <= time[i], totalTrips <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] time = new int[]{1, 2, 3};
        int totalTrips = 5;
        long expected = 3;
        var result = solution.minimumTime(time, totalTrips);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] time = new int[]{2};
        int totalTrips = 1;
        long expected = 2;
        var result = solution.minimumTime(time, totalTrips);
        assertThat(result).isEqualTo(expected);
    }

}
