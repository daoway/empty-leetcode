package com.blogspot.ostas.leetcode.all.medium.path_in_zigzag_labelled_binary_tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: label = 14
    Output: [1,3,4,14]
    Example 2:
    Input: label = 26
    Output: [1,2,6,10,26]
      Constraints:
    1 <= label <= 10^6
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int label = 14;
        List<Integer> expected = List.of(1, 3, 4, 14);
        var result = solution.pathInZigZagTree(label);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int label = 26;
        List<Integer> expected = List.of(1, 2, 6, 10, 26);
        var result = solution.pathInZigZagTree(label);
        assertThat(result).isEqualTo(expected);
    }

}
