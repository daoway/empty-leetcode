package com.blogspot.ostas.leetcode.all.hard.count_number_of_possible_root_nodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: edges = [[0,1],[1,2],[1,3],[4,2]], guesses = [[1,3],[0,1],[1,0],[2,4]], k = 3
    Output: 3
    Explanation:
    Root = 0, correct guesses = [1,3], [0,1], [2,4]
    Root = 1, correct guesses = [1,3], [1,0], [2,4]
    Root = 2, correct guesses = [1,3], [1,0], [2,4]
    Root = 3, correct guesses = [1,0], [2,4]
    Root = 4, correct guesses = [1,3], [1,0]
    Considering 0, 1, or 2 as root node leads to 3 correct guesses.
    Example 2:
    Input: edges = [[0,1],[1,2],[2,3],[3,4]], guesses = [[1,0],[3,4],[2,1],[3,2]], k = 1
    Output: 5
    Explanation:
    Root = 0, correct guesses = [3,4]
    Root = 1, correct guesses = [1,0], [3,4]
    Root = 2, correct guesses = [1,0], [2,1], [3,4]
    Root = 3, correct guesses = [1,0], [2,1], [3,2], [3,4]
    Root = 4, correct guesses = [1,0], [2,1], [3,2]
    Considering any node as root will give at least 1 correct guess.
      Constraints:
    edges.length == n - 1
    2 <= n <= 105
    1 <= guesses.length <= 105
    0 <= ai, bi, uj, vj <= n - 1
    ai != bi
    uj != vj
    edges represents a valid tree.
    guesses[j] is an edge of the tree.
    guesses is unique.
    0 <= k <= guesses.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {1, 3}, {4, 2}};
        int[][] guesses = new int[][]{{1, 3}, {0, 1}, {1, 0}, {2, 4}};
        int k = 3;
        int expected = 3;
        var result = solution.rootCount(edges, guesses, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        int[][] guesses = new int[][]{{1, 0}, {3, 4}, {2, 1}, {3, 2}};
        int k = 1;
        int expected = 5;
        var result = solution.rootCount(edges, guesses, k);
        assertThat(result).isEqualTo(expected);
    }

}
