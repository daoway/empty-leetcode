package com.blogspot.ostas.leetcode.all.hard.number_of_good_paths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: vals = [1,3,2,1,3], edges = [[0,1],[0,2],[2,3],[2,4]]
    Output: 6
    Explanation: There are 5 good paths consisting of a single node.
    There is 1 additional good path: 1 -> 0 -> 2 -> 4.
    (The reverse path 4 -> 2 -> 0 -> 1 is treated as the same as 1 -> 0 -> 2 -> 4.)
    Note that 0 -> 2 -> 3 is not a good path because vals[2] > vals[0].
    Example 2:
    Input: vals = [1,1,2,2,3], edges = [[0,1],[1,2],[2,3],[2,4]]
    Output: 7
    Explanation: There are 5 good paths consisting of a single node.
    There are 2 additional good paths: 0 -> 1 and 2 -> 3.
    Example 3:
    Input: vals = [1], edges = []
    Output: 1
    Explanation: The tree consists of only one node, so there is one good path.
      Constraints:
    n == vals.length
    1 <= n <= 3 * 104
    0 <= vals[i] <= 105
    edges.length == n - 1
    edges[i].length == 2
    0 <= ai, bi < n
    ai != bi
    edges represents a valid tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] vals = new int[]{1, 3, 2, 1, 3};
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}};
        int expected = 6;
        var result = solution.numberOfGoodPaths(vals, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] vals = new int[]{1, 1, 2, 2, 3};
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {2, 4}};
        int expected = 7;
        var result = solution.numberOfGoodPaths(vals, edges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] vals = new int[]{1};
        int[][] edges = new int[][]{};
        int expected = 1;
        var result = solution.numberOfGoodPaths(vals, edges);
        assertThat(result).isEqualTo(expected);
    }

}
