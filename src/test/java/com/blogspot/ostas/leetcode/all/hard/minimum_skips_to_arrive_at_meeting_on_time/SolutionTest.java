package com.blogspot.ostas.leetcode.all.hard.minimum_skips_to_arrive_at_meeting_on_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dist = [1,3,2], speed = 4, hoursBefore = 2
    Output: 1
    Explanation:
    Without skipping any rests, you will arrive in (1/4 + 3/4) + (3/4 + 1/4) + (2/4) = 2.5 hours.
    You can skip the first rest to arrive in ((1/4 + 0) + (3/4 + 0)) + (2/4) = 1.5 hours.
    Note that the second rest is shortened because you finish traveling the second road at an integer hour due to skipping the first rest.
    Example 2:
    Input: dist = [7,3,5,5], speed = 2, hoursBefore = 10
    Output: 2
    Explanation:
    Without skipping any rests, you will arrive in (7/2 + 1/2) + (3/2 + 1/2) + (5/2 + 1/2) + (5/2) = 11.5 hours.
    You can skip the first and third rest to arrive in ((7/2 + 0) + (3/2 + 0)) + ((5/2 + 0) + (5/2)) = 10 hours.
    Example 3:
    Input: dist = [7,3,5,5], speed = 1, hoursBefore = 10
    Output: -1
    Explanation: It is impossible to arrive at the meeting on time even if you skip all the rests.
      Constraints:
    n == dist.length
    1 <= n <= 1000
    1 <= dist[i] <= 105
    1 <= speed <= 106
    1 <= hoursBefore <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] dist = new int[]{1, 3, 2};
        int speed = 4;
        int hoursBefore = 2;
        int expected = 1;
        var result = solution.minSkips(dist, speed, hoursBefore);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] dist = new int[]{7, 3, 5, 5};
        int speed = 2;
        int hoursBefore = 10;
        int expected = 2;
        var result = solution.minSkips(dist, speed, hoursBefore);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] dist = new int[]{7, 3, 5, 5};
        int speed = 1;
        int hoursBefore = 10;
        int expected = -1;
        var result = solution.minSkips(dist, speed, hoursBefore);
        assertThat(result).isEqualTo(expected);
    }

}
