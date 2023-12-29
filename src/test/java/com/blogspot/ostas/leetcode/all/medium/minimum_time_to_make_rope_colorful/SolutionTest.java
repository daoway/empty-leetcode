package com.blogspot.ostas.leetcode.all.medium.minimum_time_to_make_rope_colorful;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: colors = "abaac", neededTime = [1,2,3,4,5]
    Output: 3
    Explanation: In the above image, 'a' is blue, 'b' is red, and 'c' is green.
    Bob can remove the blue balloon at index 2. This takes 3 seconds.
    There are no longer two consecutive balloons of the same color. Total time = 3.
    Example 2:
    Input: colors = "abc", neededTime = [1,2,3]
    Output: 0
    Explanation: The rope is already colorful. Bob does not need to remove any balloons from the rope.
    Example 3:
    Input: colors = "aabaa", neededTime = [1,2,3,4,1]
    Output: 2
    Explanation: Bob will remove the ballons at indices 0 and 4. Each ballon takes 1 second to remove.
    There are no longer two consecutive balloons of the same color. Total time = 1 + 1 = 2.
      Constraints:
    n == colors.length == neededTime.length
    1 <= n <= 105
    1 <= neededTime[i] <= 104
    colors contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String colors = "abaac";
        int[] neededTime = new int[]{1, 2, 3, 4, 5};
        int expected = 3;
        var result = solution.minCost(colors, neededTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String colors = "abc";
        int[] neededTime = new int[]{1, 2, 3};
        int expected = 0;
        var result = solution.minCost(colors, neededTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String colors = "aabaa";
        int[] neededTime = new int[]{1, 2, 3, 4, 1};
        int expected = 2;
        var result = solution.minCost(colors, neededTime);
        assertThat(result).isEqualTo(expected);
    }

}
