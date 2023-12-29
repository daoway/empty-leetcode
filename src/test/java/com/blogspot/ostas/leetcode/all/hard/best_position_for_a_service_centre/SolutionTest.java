package com.blogspot.ostas.leetcode.all.hard.best_position_for_a_service_centre;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.round;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: positions = [[0,1],[1,0],[1,2],[2,1]]
    Output: 4.00000
    Explanation: As shown, you can see that choosing [xcentre, ycentre] = [1, 1] will make the distance to each customer = 1, the sum of all distances is 4 which is the minimum possible we can achieve.
    Example 2:
    Input: positions = [[1,1],[3,3]]
    Output: 2.82843
    Explanation: The minimum possible sum of distances = sqrt(2) + sqrt(2) = 2.82843
      Constraints:
    1 <= positions.length <= 50
    positions[i].length == 2
    0 <= xi, yi <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] positions = new int[][]{{0, 1}, {1, 0}, {1, 2}, {2, 1}};
        double expected = 4.00000;
        var result = solution.getMinDistSum(positions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] positions = new int[][]{{1, 1}, {3, 3}};
        double expected = 2.82843;
        var result = solution.getMinDistSum(positions);
        assertThat(round(result)).isEqualTo(expected);
    }

}
