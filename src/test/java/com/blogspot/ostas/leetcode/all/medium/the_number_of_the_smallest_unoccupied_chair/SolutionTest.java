package com.blogspot.ostas.leetcode.all.medium.the_number_of_the_smallest_unoccupied_chair;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: times = [[1,4],[2,3],[4,6]], targetFriend = 1
    Output: 1
    Explanation:
    - Friend 0 arrives at time 1 and sits on chair 0.
    - Friend 1 arrives at time 2 and sits on chair 1.
    - Friend 1 leaves at time 3 and chair 1 becomes empty.
    - Friend 0 leaves at time 4 and chair 0 becomes empty.
    - Friend 2 arrives at time 4 and sits on chair 0.
    Since friend 1 sat on chair 1, we return 1.
    Example 2:
    Input: times = [[3,10],[1,5],[2,6]], targetFriend = 0
    Output: 2
    Explanation:
    - Friend 1 arrives at time 1 and sits on chair 0.
    - Friend 2 arrives at time 2 and sits on chair 1.
    - Friend 0 arrives at time 3 and sits on chair 2.
    - Friend 1 leaves at time 5 and chair 0 becomes empty.
    - Friend 2 leaves at time 6 and chair 1 becomes empty.
    - Friend 0 leaves at time 10 and chair 2 becomes empty.
    Since friend 0 sat on chair 2, we return 2.
      Constraints:
    n == times.length
    2 <= n <= 104
    times[i].length == 2
    1 <= arrivali < leavingi <= 105
    0 <= targetFriend <= n - 1
    Each arrivali time is distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] times = new int[][]{{1, 4}, {2, 3}, {4, 6}};
        int targetFriend = 1;
        int expected = 1;
        var result = solution.smallestChair(times, targetFriend);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] times = new int[][]{{3, 10}, {1, 5}, {2, 6}};
        int targetFriend = 0;
        int expected = 2;
        var result = solution.smallestChair(times, targetFriend);
        assertThat(result).isEqualTo(expected);
    }

}
