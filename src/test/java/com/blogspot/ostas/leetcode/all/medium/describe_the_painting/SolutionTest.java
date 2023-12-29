package com.blogspot.ostas.leetcode.all.medium.describe_the_painting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: segments = [[1,4,5],[4,7,7],[1,7,9]]
    Output: [[1,4,14],[4,7,16]]
    Explanation: The painting can be described as follows:
    - [1,4) is colored {5,9} (with a sum of 14) from the first and third segments.
    - [4,7) is colored {7,9} (with a sum of 16) from the second and third segments.
    Example 2:
    Input: segments = [[1,7,9],[6,8,15],[8,10,7]]
    Output: [[1,6,9],[6,7,24],[7,8,15],[8,10,7]]
    Explanation: The painting can be described as follows:
    - [1,6) is colored 9 from the first segment.
    - [6,7) is colored {9,15} (with a sum of 24) from the first and second segments.
    - [7,8) is colored 15 from the second segment.
    - [8,10) is colored 7 from the third segment.
    Example 3:
    Input: segments = [[1,4,5],[1,4,7],[4,7,1],[4,7,11]]
    Output: [[1,4,12],[4,7,12]]
    Explanation: The painting can be described as follows:
    - [1,4) is colored {5,7} (with a sum of 12) from the first and second segments.
    - [4,7) is colored {1,11} (with a sum of 12) from the third and fourth segments.
    Note that returning a single segment [1,7) is incorrect because the mixed color sets are different.
      Constraints:
    1 <= segments.length <= 2 * 104
    segments[i].length == 3
    1 <= starti < endi <= 105
    1 <= colori <= 109
    Each colori is distinct.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] segments = new int[][]{{1, 4, 5}, {4, 7, 7}, {1, 7, 9}};
        List<List<Long>> expected = List.of(List.of(1L, 4L, 14L), List.of(4L, 7L, 16L));
        var result = solution.splitPainting(segments);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] segments = new int[][]{{1, 7, 9}, {6, 8, 15}, {8, 10, 7}};
        List<List<Long>> expected =
                List.of(List.of(1L, 6L, 9L), List.of(6L, 7L, 24L), List.of(7L, 8L, 15L),
                        List.of(8L, 10L, 7L));
        var result = solution.splitPainting(segments);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] segments = new int[][]{{1, 4, 5}, {1, 4, 7}, {4, 7, 1}, {4, 7, 11}};
        List<List<Long>> expected = List.of(List.of(1L, 4L, 12L), List.of(4L, 7L, 12L));
        var result = solution.splitPainting(segments);
        assertThat(result).isEqualTo(expected);
    }

}
