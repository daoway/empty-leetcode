package com.blogspot.ostas.leetcode.all.hard.allocate_mailboxes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: houses = [1,4,8,10,20], k = 3
    Output: 5
    Explanation: Allocate mailboxes in position 3, 9 and 20.
    Minimum total distance from each houses to nearest mailboxes is |3-1| + |4-3| + |9-8| + |10-9| + |20-20| = 5
    Example 2:
    Input: houses = [2,3,5,12,18], k = 2
    Output: 9
    Explanation: Allocate mailboxes in position 3 and 14.
    Minimum total distance from each houses to nearest mailboxes is |2-3| + |3-3| + |5-3| + |12-14| + |18-14| = 9.
      Constraints:
    1 <= k <= houses.length <= 100
    1 <= houses[i] <= 104
    All the integers of houses are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] houses = new int[]{1, 4, 8, 10, 20};
        int k = 3;
        int expected = 5;
        var result = solution.minDistance(houses, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] houses = new int[]{2, 3, 5, 12, 18};
        int k = 2;
        int expected = 9;
        var result = solution.minDistance(houses, k);
        assertThat(result).isEqualTo(expected);
    }

}
