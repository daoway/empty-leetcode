package com.blogspot.ostas.leetcode.all.medium.beautiful_towers_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: maxHeights = [5,3,4,1,1]
    Output: 13
    Explanation: One beautiful configuration with a maximum sum is heights = [5,3,3,1,1]. This configuration is beautiful since:
    - 1 <= heights[i] <= maxHeights[i]
    - heights is a mountain of peak i = 0.
    It can be shown that there exists no other beautiful configuration with a sum of heights greater than 13.
    Example 2:
    Input: maxHeights = [6,5,3,9,2,7]
    Output: 22
    Explanation: One beautiful configuration with a maximum sum is heights = [3,3,3,9,2,2]. This configuration is beautiful since:
    - 1 <= heights[i] <= maxHeights[i]
    - heights is a mountain of peak i = 3.
    It can be shown that there exists no other beautiful configuration with a sum of heights greater than 22.
    Example 3:
    Input: maxHeights = [3,2,5,5,2,3]
    Output: 18
    Explanation: One beautiful configuration with a maximum sum is heights = [2,2,5,5,2,2]. This configuration is beautiful since:
    - 1 <= heights[i] <= maxHeights[i]
    - heights is a mountain of peak i = 2.
    Note that, for this configuration, i = 3 can also be considered a peak.
    It can be shown that there exists no other beautiful configuration with a sum of heights greater than 18.
      Constraints:
    1 <= n == maxHeights <= 105
    1 <= maxHeights[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> maxHeights = List.of(5, 3, 4, 1, 1);
        long expected = 13;
        var result = solution.maximumSumOfHeights(maxHeights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> maxHeights = List.of(6, 5, 3, 9, 2, 7);
        long expected = 22;
        var result = solution.maximumSumOfHeights(maxHeights);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<Integer> maxHeights = List.of(3, 2, 5, 5, 2, 3);
        long expected = 18;
        var result = solution.maximumSumOfHeights(maxHeights);
        assertThat(result).isEqualTo(expected);
    }

}
