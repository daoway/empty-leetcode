package com.blogspot.ostas.leetcode.all.medium.maximize_distance_to_closest_person;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: seats = [1,0,0,0,1,0,1]
    Output: 2
    Explanation:
    If Alex sits in the second open seat (i.e. seats[2]), then the closest person has distance 2.
    If Alex sits in any other open seat, the closest person has distance 1.
    Thus, the maximum distance to the closest person is 2.
    Example 2:
    Input: seats = [1,0,0,0]
    Output: 3
    Explanation:
    If Alex sits in the last seat (i.e. seats[3]), the closest person is 3 seats away.
    This is the maximum distance possible, so the answer is 3.
    Example 3:
    Input: seats = [0,1]
    Output: 1
      Constraints:
    2 <= seats.length <= 2 * 104
    seats[i] is 0 or 1.
    At least one seat is empty.
    At least one seat is occupied.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] seats = new int[]{1, 0, 0, 0, 1, 0, 1};
        int expected = 2;
        var result = solution.maxDistToClosest(seats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] seats = new int[]{1, 0, 0, 0};
        int expected = 3;
        var result = solution.maxDistToClosest(seats);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] seats = new int[]{0, 1};
        int expected = 1;
        var result = solution.maxDistToClosest(seats);
        assertThat(result).isEqualTo(expected);
    }

}
