package com.blogspot.ostas.leetcode.all.medium.double_modular_exponentiation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: variables = [[2,3,3,10],[3,3,3,1],[6,1,1,4]], target = 2
    Output: [0,2]
    Explanation: For each index i in the variables array:
    1) For the index 0, variables[0] = [2,3,3,10], (23 % 10)3 % 10 = 2.
    2) For the index 1, variables[1] = [3,3,3,1], (33 % 10)3 % 1 = 0.
    3) For the index 2, variables[2] = [6,1,1,4], (61 % 10)1 % 4 = 2.
    Therefore we return [0,2] as the answer.
    Example 2:
    Input: variables = [[39,3,1000,1000]], target = 17
    Output: []
    Explanation: For each index i in the variables array:
    1) For the index 0, variables[0] = [39,3,1000,1000], (393 % 10)1000 % 1000 = 1.
    Therefore we return [] as the answer.
      Constraints:
    1 <= variables.length <= 100
    variables[i] == [ai, bi, ci, mi]
    1 <= ai, bi, ci, mi <= 103
    0 <= target <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] variables = new int[][]{{2, 3, 3, 10}, {3, 3, 3, 1}, {6, 1, 1, 4}};
        int target = 2;
        List<Integer> expected = List.of(0, 2);
        var result = solution.getGoodIndices(variables, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] variables = new int[][]{{39, 3, 1000, 1000}};
        int target = 17;
        List<Integer> expected = List.of();
        var result = solution.getGoodIndices(variables, target);
        assertThat(result).isEqualTo(expected);
    }

}
