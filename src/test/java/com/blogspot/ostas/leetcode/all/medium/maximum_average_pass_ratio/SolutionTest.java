package com.blogspot.ostas.leetcode.all.medium.maximum_average_pass_ratio;

import org.junit.jupiter.api.Test;

import static com.blogspot.ostas.leetcode.all.common.Utils.round;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: classes = [[1,2],[3,5],[2,2]], extraStudents = 2
    Output: 0.78333
    Explanation: You can assign the two extra students to the first class. The average pass ratio will be equal to (3/4 + 3/5 + 2/2) / 3 = 0.78333.
    Example 2:
    Input: classes = [[2,4],[3,9],[4,5],[2,10]], extraStudents = 4
    Output: 0.53485
      Constraints:
    1 <= classes.length <= 105
    classes[i].length == 2
    1 <= passi <= totali <= 105
    1 <= extraStudents <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] classes = new int[][]{{1, 2}, {3, 5}, {2, 2}};
        int extraStudents = 2;
        double expected = 0.78333;
        var result = solution.maxAverageRatio(classes, extraStudents);
        assertThat(round(result)).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] classes = new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}};
        int extraStudents = 4;
        double expected = 0.53485;
        var result = solution.maxAverageRatio(classes, extraStudents);
        assertThat(round(result)).isEqualTo(expected);
    }

}
