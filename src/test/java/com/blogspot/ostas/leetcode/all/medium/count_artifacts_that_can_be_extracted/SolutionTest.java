package com.blogspot.ostas.leetcode.all.medium.count_artifacts_that_can_be_extracted;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1]]
    Output: 1
    Explanation:
    The different colors represent different artifacts. Excavated cells are labeled with a 'D' in the grid.
    There is 1 artifact that can be extracted, namely the red artifact.
    The blue artifact has one part in cell (1,1) which remains uncovered, so we cannot extract it.
    Thus, we return 1.
    Example 2:
    Input: n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1],[1,1]]
    Output: 2
    Explanation: Both the red and blue artifacts have all parts uncovered (labeled with a 'D') and can be extracted, so we return 2.
      Constraints:
    1 <= n <= 1000
    1 <= artifacts.length, dig.length <= min(n2, 105)
    artifacts[i].length == 4
    dig[i].length == 2
    0 <= r1i, c1i, r2i, c2i, ri, ci <= n - 1
    r1i <= r2i
    c1i <= c2i
    No two artifacts will overlap.
    The number of cells covered by an artifact is at most 4.
    The entries of dig are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[][] artifacts = new int[][]{{0, 0, 0, 0}, {0, 1, 1, 1}};
        int[][] dig = new int[][]{{0, 0}, {0, 1}};
        int expected = 1;
        var result = solution.digArtifacts(n, artifacts, dig);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] artifacts = new int[][]{{0, 0, 0, 0}, {0, 1, 1, 1}};
        int[][] dig = new int[][]{{0, 0}, {0, 1}, {1, 1}};
        int expected = 2;
        var result = solution.digArtifacts(n, artifacts, dig);
        assertThat(result).isEqualTo(expected);
    }

}
