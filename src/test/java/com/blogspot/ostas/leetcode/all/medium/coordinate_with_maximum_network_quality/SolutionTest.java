package com.blogspot.ostas.leetcode.all.medium.coordinate_with_maximum_network_quality;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: towers = [[1,2,5],[2,1,7],[3,1,9]], radius = 2
    Output: [2,1]
    Explanation: At coordinate (2, 1) the total quality is 13.
    - Quality of 7 from (2, 1) results in ⌊7 / (1 + sqrt(0)⌋ = ⌊7⌋ = 7
    - Quality of 5 from (1, 2) results in ⌊5 / (1 + sqrt(2)⌋ = ⌊2.07⌋ = 2
    - Quality of 9 from (3, 1) results in ⌊9 / (1 + sqrt(1)⌋ = ⌊4.5⌋ = 4
    No other coordinate has a higher network quality.
    Example 2:
    Input: towers = [[23,11,21]], radius = 9
    Output: [23,11]
    Explanation: Since there is only one tower, the network quality is highest right at the tower's location.
    Example 3:
    Input: towers = [[1,2,13],[2,1,7],[0,1,9]], radius = 2
    Output: [1,2]
    Explanation: Coordinate (1, 2) has the highest network quality.
      Constraints:
    1 <= towers.length <= 50
    towers[i].length == 3
    0 <= xi, yi, qi <= 50
    1 <= radius <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] towers = new int[][]{{1, 2, 5}, {2, 1, 7}, {3, 1, 9}};
        int radius = 2;
        int[] expected = new int[]{2, 1};
        var result = solution.bestCoordinate(towers, radius);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] towers = new int[][]{{23, 11, 21}};
        int radius = 9;
        int[] expected = new int[]{23, 11};
        var result = solution.bestCoordinate(towers, radius);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] towers = new int[][]{{1, 2, 13}, {2, 1, 7}, {0, 1, 9}};
        int radius = 2;
        int[] expected = new int[]{1, 2};
        var result = solution.bestCoordinate(towers, radius);
        assertThat(result).isEqualTo(expected);
    }

}
