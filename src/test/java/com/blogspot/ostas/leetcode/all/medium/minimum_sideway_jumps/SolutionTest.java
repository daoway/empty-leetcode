package com.blogspot.ostas.leetcode.all.medium.minimum_sideway_jumps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: obstacles = [0,1,2,3,0]
    Output: 2
    Explanation: The optimal solution is shown by the arrows above. There are 2 side jumps (red arrows).
    Note that the frog can jump over obstacles only when making side jumps (as shown at point 2).
    Example 2:
    Input: obstacles = [0,1,1,3,3,0]
    Output: 0
    Explanation: There are no obstacles on lane 2. No side jumps are required.
    Example 3:
    Input: obstacles = [0,2,1,0,3,0]
    Output: 2
    Explanation: The optimal solution is shown by the arrows above. There are 2 side jumps.
      Constraints:
    obstacles.length == n + 1
    1 <= n <= 5 * 105
    0 <= obstacles[i] <= 3
    obstacles[0] == obstacles[n] == 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] obstacles = new int[]{0, 1, 2, 3, 0};
        int expected = 2;
        var result = solution.minSideJumps(obstacles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] obstacles = new int[]{0, 1, 1, 3, 3, 0};
        int expected = 0;
        var result = solution.minSideJumps(obstacles);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] obstacles = new int[]{0, 2, 1, 0, 3, 0};
        int expected = 2;
        var result = solution.minSideJumps(obstacles);
        assertThat(result).isEqualTo(expected);
    }

}
