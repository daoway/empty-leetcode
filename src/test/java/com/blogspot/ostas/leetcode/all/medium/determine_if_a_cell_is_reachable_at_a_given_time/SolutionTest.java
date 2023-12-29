package com.blogspot.ostas.leetcode.all.medium.determine_if_a_cell_is_reachable_at_a_given_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sx = 2, sy = 4, fx = 7, fy = 7, t = 6
    Output: true
    Explanation: Starting at cell (2, 4), we can reach cell (7, 7) in exactly 6 seconds by going through the cells depicted in the picture above.
    Example 2:
    Input: sx = 3, sy = 1, fx = 7, fy = 3, t = 3
    Output: false
    Explanation: Starting at cell (3, 1), it takes at least 4 seconds to reach cell (7, 3) by going through the cells depicted in the picture above. Hence, we cannot reach cell (7, 3) at the third second.
      Constraints:
    1 <= sx, sy, fx, fy <= 109
    0 <= t <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int sx = 2;
        int sy = 4;
        int fx = 7;
        int fy = 7;
        int t = 6;
        boolean expected = true;
        var result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int sx = 3;
        int sy = 1;
        int fx = 7;
        int fy = 3;
        int t = 3;
        boolean expected = false;
        var result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertThat(result).isEqualTo(expected);
    }

}
