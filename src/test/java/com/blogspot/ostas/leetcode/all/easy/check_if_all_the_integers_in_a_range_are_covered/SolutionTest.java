package com.blogspot.ostas.leetcode.all.easy.check_if_all_the_integers_in_a_range_are_covered;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ranges = [[1,2],[3,4],[5,6]], left = 2, right = 5
    Output: true
    Explanation: Every integer between 2 and 5 is covered:
    - 2 is covered by the first range.
    - 3 and 4 are covered by the second range.
    - 5 is covered by the third range.
    Example 2:
    Input: ranges = [[1,10],[10,20]], left = 21, right = 21
    Output: false
    Explanation: 21 is not covered by any range.
      Constraints:
    1 <= ranges.length <= 50
    1 <= starti <= endi <= 50
    1 <= left <= right <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] ranges = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        int left = 2;
        int right = 5;
        boolean expected = true;
        var result = solution.isCovered(ranges, left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] ranges = new int[][]{{1, 10}, {10, 20}};
        int left = 21;
        int right = 21;
        boolean expected = false;
        var result = solution.isCovered(ranges, left, right);
        assertThat(result).isEqualTo(expected);
    }

}
