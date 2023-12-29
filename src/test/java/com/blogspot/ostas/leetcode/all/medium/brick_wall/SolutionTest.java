package com.blogspot.ostas.leetcode.all.medium.brick_wall;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
    Output: 2
    Example 2:
    Input: wall = [[1],[1],[1]]
    Output: 3
      Constraints:
    n == wall.length
    1 <= n <= 104
    1 <= wall[i].length <= 104
    1 <= sum(wall[i].length) <= 2 * 104
    sum(wall[i]) is the same for each row i.
    1 <= wall[i][j] <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> wall =
                List.of(List.of(1, 2, 2, 1), List.of(3, 1, 2), List.of(1, 3, 2), List.of(2, 4),
                        List.of(3, 1, 2), List.of(1, 3, 1, 1));
        int expected = 2;
        var result = solution.leastBricks(wall);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> wall = List.of(List.of(1), List.of(1), List.of(1));
        int expected = 3;
        var result = solution.leastBricks(wall);
        assertThat(result).isEqualTo(expected);
    }

}
