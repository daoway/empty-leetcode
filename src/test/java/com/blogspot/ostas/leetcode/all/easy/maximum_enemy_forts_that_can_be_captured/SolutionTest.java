package com.blogspot.ostas.leetcode.all.easy.maximum_enemy_forts_that_can_be_captured;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: forts = [1,0,0,-1,0,0,0,0,1]
    Output: 4
    Explanation:
    - Moving the army from position 0 to position 3 captures 2 enemy forts, at 1 and 2.
    - Moving the army from position 8 to position 3 captures 4 enemy forts.
    Since 4 is the maximum number of enemy forts that can be captured, we return 4.
    Example 2:
    Input: forts = [0,0,1,-1]
    Output: 0
    Explanation: Since no enemy fort can be captured, 0 is returned.
      Constraints:
    1 <= forts.length <= 1000
    -1 <= forts[i] <= 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] forts = new int[]{1, 0, 0, -1, 0, 0, 0, 0, 1};
        int expected = 4;
        var result = solution.captureForts(forts);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] forts = new int[]{0, 0, 1, -1};
        int expected = 0;
        var result = solution.captureForts(forts);
        assertThat(result).isEqualTo(expected);
    }

}
