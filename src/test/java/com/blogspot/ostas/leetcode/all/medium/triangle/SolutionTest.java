package com.blogspot.ostas.leetcode.all.medium.triangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    Output: 11
    Explanation: The triangle looks like:
       2
      3 4
     6 5 7
    4 1 8 3
    The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
    Example 2:
    Input: triangle = [[-10]]
    Output: -10
      Constraints:
    1 <= triangle.length <= 200
    triangle[0].length == 1
    triangle[i].length == triangle[i - 1].length + 1
    -104 <= triangle[i][j] <= 104
      Follow up: Could you do this using only O(n) extra space, where n is the total number of rows in the triangle?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> triangle =
                new ArrayList<>(
                        List.of(
                                new ArrayList<>(List.of(2)),
                                new ArrayList<>(List.of(3, 4)),
                                new ArrayList<>(List.of(6, 5, 7)),
                                new ArrayList<>(List.of(4, 1, 8, 3))
                        )
                );
        int expected = 11;
        var result = solution.minimumTotal(triangle);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> triangle = List.of(List.of(-10));
        int expected = -10;
        var result = solution.minimumTotal(triangle);
        assertThat(result).isEqualTo(expected);
    }

}
