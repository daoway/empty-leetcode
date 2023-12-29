package com.blogspot.ostas.leetcode.all.medium.first_day_where_you_have_been_in_all_the_rooms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: nextVisit = [0,0]
    Output: 2
    Explanation:
    - On day 0, you visit room 0. The total times you have been in room 0 is 1, which is odd.
      On the next day you will visit room nextVisit[0] = 0
    - On day 1, you visit room 0, The total times you have been in room 0 is 2, which is even.
      On the next day you will visit room (0 + 1) mod 2 = 1
    - On day 2, you visit room 1. This is the first day where you have been in all the rooms.
    Example 2:
    Input: nextVisit = [0,0,2]
    Output: 6
    Explanation:
    Your room visiting order for each day is: [0,0,1,0,0,1,2,...].
    Day 6 is the first day where you have been in all the rooms.
    Example 3:
    Input: nextVisit = [0,1,2,0]
    Output: 6
    Explanation:
    Your room visiting order for each day is: [0,0,1,1,2,2,3,...].
    Day 6 is the first day where you have been in all the rooms.
      Constraints:
    n == nextVisit.length
    2 <= n <= 105
    0 <= nextVisit[i] <= i
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] nextVisit = new int[]{0, 0};
        int expected = 2;
        var result = solution.firstDayBeenInAllRooms(nextVisit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] nextVisit = new int[]{0, 0, 2};
        int expected = 6;
        var result = solution.firstDayBeenInAllRooms(nextVisit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] nextVisit = new int[]{0, 1, 2, 0};
        int expected = 6;
        var result = solution.firstDayBeenInAllRooms(nextVisit);
        assertThat(result).isEqualTo(expected);
    }

}
