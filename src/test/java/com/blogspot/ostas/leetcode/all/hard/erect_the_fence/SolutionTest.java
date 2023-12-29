package com.blogspot.ostas.leetcode.all.hard.erect_the_fence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: trees = [[1,1],[2,2],[2,0],[2,4],[3,3],[4,2]]
    Output: [[1,1],[2,0],[4,2],[3,3],[2,4]]
    Explanation: All the trees will be on the perimeter of the fence except the tree at [2, 2], which will be inside the fence.
    Example 2:
    Input: trees = [[1,2],[2,2],[4,2]]
    Output: [[4,2],[2,2],[1,2]]
    Explanation: The fence forms a line that passes through all the trees.
      Constraints:
    1 <= trees.length <= 3000
    trees[i].length == 2
    0 <= xi, yi <= 100
    All the given positions are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] trees = new int[][]{{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}};
        int[][] expected = new int[][]{{1, 1}, {2, 0}, {4, 2}, {3, 3}, {2, 4}};
        var result = solution.outerTrees(trees);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] trees = new int[][]{{1, 2}, {2, 2}, {4, 2}};
        int[][] expected = new int[][]{{4, 2}, {2, 2}, {1, 2}};
        var result = solution.outerTrees(trees);
        assertThat(result).isEqualTo(expected);
    }

}
