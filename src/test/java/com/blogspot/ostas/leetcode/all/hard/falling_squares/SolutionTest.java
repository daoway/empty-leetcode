package com.blogspot.ostas.leetcode.all.hard.falling_squares;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: positions = [[1,2],[2,3],[6,1]]
    Output: [2,5,5]
    Explanation:
    After the first drop, the tallest stack is square 1 with a height of 2.
    After the second drop, the tallest stack is squares 1 and 2 with a height of 5.
    After the third drop, the tallest stack is still squares 1 and 2 with a height of 5.
    Thus, we return an answer of [2, 5, 5].
    Example 2:
    Input: positions = [[100,100],[200,100]]
    Output: [100,100]
    Explanation:
    After the first drop, the tallest stack is square 1 with a height of 100.
    After the second drop, the tallest stack is either square 1 or square 2, both with heights of 100.
    Thus, we return an answer of [100, 100].
    Note that square 2 only brushes the right side of square 1, which does not count as landing on it.
      Constraints:
    1 <= positions.length <= 1000
    1 <= lefti <= 108
    1 <= sideLengthi <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] positions = new int[][]{{1, 2}, {2, 3}, {6, 1}};
        List<Integer> expected = List.of(2, 5, 5);
        var result = solution.fallingSquares(positions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] positions = new int[][]{{100, 100}, {200, 100}};
        List<Integer> expected = List.of(100, 100);
        var result = solution.fallingSquares(positions);
        assertThat(result).isEqualTo(expected);
    }

}
