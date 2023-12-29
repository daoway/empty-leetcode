package com.blogspot.ostas.leetcode.all.medium.friends_of_appropriate_ages;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ages = [16,16]
    Output: 2
    Explanation: 2 people friend request each other.
    Example 2:
    Input: ages = [16,17,18]
    Output: 2
    Explanation: Friend requests are made 17 -> 16, 18 -> 17.
    Example 3:
    Input: ages = [20,30,100,110,120]
    Output: 3
    Explanation: Friend requests are made 110 -> 100, 120 -> 110, 120 -> 100.
      Constraints:
    n == ages.length
    1 <= n <= 2 * 104
    1 <= ages[i] <= 120
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] ages = new int[]{16, 16};
        int expected = 2;
        var result = solution.numFriendRequests(ages);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] ages = new int[]{16, 17, 18};
        int expected = 2;
        var result = solution.numFriendRequests(ages);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] ages = new int[]{20, 30, 100, 110, 120};
        int expected = 3;
        var result = solution.numFriendRequests(ages);
        assertThat(result).isEqualTo(expected);
    }

}
