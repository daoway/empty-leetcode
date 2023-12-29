package com.blogspot.ostas.leetcode.all.medium.count_ways_to_group_overlapping_ranges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ranges = [[6,10],[5,15]]
    Output: 2
    Explanation:
    The two ranges are overlapping, so they must be in the same group.
    Thus, there are two possible ways:
    - Put both the ranges together in group 1.
    - Put both the ranges together in group 2.
    Example 2:
    Input: ranges = [[1,3],[10,20],[2,5],[4,8]]
    Output: 4
    Explanation:
    Ranges [1,3], and [2,5] are overlapping. So, they must be in the same group.
    Again, ranges [2,5] and [4,8] are also overlapping. So, they must also be in the same group.
    Thus, there are four possible ways to group them:
    - All the ranges in group 1.
    - All the ranges in group 2.
    - Ranges [1,3], [2,5], and [4,8] in group 1 and [10,20] in group 2.
    - Ranges [1,3], [2,5], and [4,8] in group 2 and [10,20] in group 1.
      Constraints:
    1 <= ranges.length <= 105
    ranges[i].length == 2
    0 <= starti <= endi <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] ranges = new int[][]{{6, 10}, {5, 15}};
        int expected = 2;
        var result = solution.countWays(ranges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] ranges = new int[][]{{1, 3}, {10, 20}, {2, 5}, {4, 8}};
        int expected = 4;
        var result = solution.countWays(ranges);
        assertThat(result).isEqualTo(expected);
    }

}
