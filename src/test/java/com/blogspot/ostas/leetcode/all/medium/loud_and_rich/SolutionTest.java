package com.blogspot.ostas.leetcode.all.medium.loud_and_rich;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: richer = [[1,0],[2,1],[3,1],[3,7],[4,3],[5,3],[6,3]], quiet = [3,2,5,4,6,1,7,0]
    Output: [5,5,2,5,4,5,6,7]
    Explanation:
    answer[0] = 5.
    Person 5 has more money than 3, which has more money than 1, which has more money than 0.
    The only person who is quieter (has lower quiet[x]) is person 7, but it is not clear if they have more money than person 0.
    answer[7] = 7.
    Among all people that definitely have equal to or more money than person 7 (which could be persons 3, 4, 5, 6, or 7), the person who is the quietest (has lower quiet[x]) is person 7.
    The other answers can be filled out with similar reasoning.
    Example 2:
    Input: richer = [], quiet = [0]
    Output: [0]
      Constraints:
    n == quiet.length
    1 <= n <= 500
    0 <= quiet[i] < n
    All the values of quiet are unique.
    0 <= richer.length <= n * (n - 1) / 2
    0 <= ai, bi < n
    ai != bi
    All the pairs of richer are unique.
    The observations in richer are all logically consistent.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] richer = new int[][]{{1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}};
        int[] quiet = new int[]{3, 2, 5, 4, 6, 1, 7, 0};
        int[] expected = new int[]{5, 5, 2, 5, 4, 5, 6, 7};
        var result = solution.loudAndRich(richer, quiet);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] richer = new int[][]{};
        int[] quiet = new int[]{0};
        int[] expected = new int[]{0};
        var result = solution.loudAndRich(richer, quiet);
        assertThat(result).isEqualTo(expected);
    }

}
