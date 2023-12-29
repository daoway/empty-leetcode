package com.blogspot.ostas.leetcode.all.medium.escape_the_ghosts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: ghosts = [[1,0],[0,3]], target = [0,1]
    Output: true
    Explanation: You can reach the destination (0, 1) after 1 turn, while the ghosts located at (1, 0) and (0, 3) cannot catch up with you.
    Example 2:
    Input: ghosts = [[1,0]], target = [2,0]
    Output: false
    Explanation: You need to reach the destination (2, 0), but the ghost at (1, 0) lies between you and the destination.
    Example 3:
    Input: ghosts = [[2,0]], target = [1,0]
    Output: false
    Explanation: The ghost can reach the target at the same time as you.
      Constraints:
    1 <= ghosts.length <= 100
    ghosts[i].length == 2
    -104 <= xi, yi <= 104
    There can be multiple ghosts in the same location.
    target.length == 2
    -104 <= xtarget, ytarget <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] ghosts = new int[][]{{1, 0}, {0, 3}};
        int[] target = new int[]{0, 1};
        boolean expected = true;
        var result = solution.escapeGhosts(ghosts, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] ghosts = new int[][]{{1, 0}};
        int[] target = new int[]{2, 0};
        boolean expected = false;
        var result = solution.escapeGhosts(ghosts, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] ghosts = new int[][]{{2, 0}};
        int[] target = new int[]{1, 0};
        boolean expected = false;
        var result = solution.escapeGhosts(ghosts, target);
        assertThat(result).isEqualTo(expected);
    }

}
