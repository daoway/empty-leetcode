package com.blogspot.ostas.leetcode.all.hard.count_ways_to_build_rooms_in_an_ant_colony;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prevRoom = [-1,0,1]
    Output: 1
    Explanation: There is only one way to build the additional rooms: 0 → 1 → 2
    Example 2:
    Input: prevRoom = [-1,0,0,1,2]
    Output: 6
    Explanation:
    The 6 ways are:
    0 → 1 → 3 → 2 → 4
    0 → 2 → 4 → 1 → 3
    0 → 1 → 2 → 3 → 4
    0 → 1 → 2 → 4 → 3
    0 → 2 → 1 → 3 → 4
    0 → 2 → 1 → 4 → 3
      Constraints:
    n == prevRoom.length
    2 <= n <= 105
    prevRoom[0] == -1
    0 <= prevRoom[i] < n for all 1 <= i < n
    Every room is reachable from room 0 once all the rooms are built.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prevRoom = new int[]{-1, 0, 1};
        int expected = 1;
        var result = solution.waysToBuildRooms(prevRoom);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prevRoom = new int[]{-1, 0, 0, 1, 2};
        int expected = 6;
        var result = solution.waysToBuildRooms(prevRoom);
        assertThat(result).isEqualTo(expected);
    }

}
