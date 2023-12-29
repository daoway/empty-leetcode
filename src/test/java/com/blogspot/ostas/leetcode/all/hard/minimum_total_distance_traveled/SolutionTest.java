package com.blogspot.ostas.leetcode.all.hard.minimum_total_distance_traveled;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: robot = [0,4,6], factory = [[2,2],[6,2]]
    Output: 4
    Explanation: As shown in the figure:
    - The first robot at position 0 moves in the positive direction. It will be repaired at the first factory.
    - The second robot at position 4 moves in the negative direction. It will be repaired at the first factory.
    - The third robot at position 6 will be repaired at the second factory. It does not need to move.
    The limit of the first factory is 2, and it fixed 2 robots.
    The limit of the second factory is 2, and it fixed 1 robot.
    The total distance is |2 - 0| + |2 - 4| + |6 - 6| = 4. It can be shown that we cannot achieve a better total distance than 4.
    Example 2:
    Input: robot = [1,-1], factory = [[-2,1],[2,1]]
    Output: 2
    Explanation: As shown in the figure:
    - The first robot at position 1 moves in the positive direction. It will be repaired at the second factory.
    - The second robot at position -1 moves in the negative direction. It will be repaired at the first factory.
    The limit of the first factory is 1, and it fixed 1 robot.
    The limit of the second factory is 1, and it fixed 1 robot.
    The total distance is |2 - 1| + |(-2) - (-1)| = 2. It can be shown that we cannot achieve a better total distance than 2.
      Constraints:
    1 <= robot.length, factory.length <= 100
    factory[j].length == 2
    -109 <= robot[i], positionj <= 109
    0 <= limitj <= robot.length
    The input will be generated such that it is always possible to repair every robot.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<Integer> robot = List.of(0, 4, 6);
        int[][] factory = new int[][]{{2, 2}, {6, 2}};
        long expected = 4;
        var result = solution.minimumTotalDistance(new ArrayList<>(robot), factory);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<Integer> robot = List.of(1, -1);
        int[][] factory = new int[][]{{-2, 1}, {2, 1}};
        long expected = 2;
        var result = solution.minimumTotalDistance(new ArrayList<>(robot), factory);
        assertThat(result).isEqualTo(expected);
    }

}
