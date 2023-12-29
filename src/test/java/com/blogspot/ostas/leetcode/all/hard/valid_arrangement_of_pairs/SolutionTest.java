package com.blogspot.ostas.leetcode.all.hard.valid_arrangement_of_pairs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pairs = [[5,1],[4,5],[11,9],[9,4]]
    Output: [[11,9],[9,4],[4,5],[5,1]]
    Explanation:
    This is a valid arrangement since endi-1 always equals starti.
    end0 = 9 == 9 = start1
    end1 = 4 == 4 = start2
    end2 = 5 == 5 = start3
    Example 2:
    Input: pairs = [[1,3],[3,2],[2,1]]
    Output: [[1,3],[3,2],[2,1]]
    Explanation:
    This is a valid arrangement since endi-1 always equals starti.
    end0 = 3 == 3 = start1
    end1 = 2 == 2 = start2
    The arrangements [[2,1],[1,3],[3,2]] and [[3,2],[2,1],[1,3]] are also valid.
    Example 3:
    Input: pairs = [[1,2],[1,3],[2,1]]
    Output: [[1,2],[2,1],[1,3]]
    Explanation:
    This is a valid arrangement since endi-1 always equals starti.
    end0 = 2 == 2 = start1
    end1 = 1 == 1 = start2
      Constraints:
    1 <= pairs.length <= 105
    pairs[i].length == 2
    0 <= starti, endi <= 109
    starti != endi
    No two pairs are exactly the same.
    There exists a valid arrangement of pairs.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{5, 1}, {4, 5}, {11, 9}, {9, 4}};
        int[][] expected = new int[][]{{11, 9}, {9, 4}, {4, 5}, {5, 1}};
        var result = solution.validArrangement(pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 3}, {3, 2}, {2, 1}};
        int[][] expected = new int[][]{{1, 3}, {3, 2}, {2, 1}};
        var result = solution.validArrangement(pairs);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] pairs = new int[][]{{1, 2}, {1, 3}, {2, 1}};
        int[][] expected = new int[][]{{1, 2}, {2, 1}, {1, 3}};
        var result = solution.validArrangement(pairs);
        assertThat(result).isEqualTo(expected);
    }

}
