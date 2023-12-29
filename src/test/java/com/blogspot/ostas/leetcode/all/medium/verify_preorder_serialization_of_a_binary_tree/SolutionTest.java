package com.blogspot.ostas.leetcode.all.medium.verify_preorder_serialization_of_a_binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#"
    Output: true
    Example 2:
    Input: preorder = "1,#"
    Output: false
    Example 3:
    Input: preorder = "9,#,#,1"
    Output: false
      Constraints:
    1 <= preorder.length <= 104
    preorder consist of integers in the range [0, 100] and '#' separated by commas ','.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        boolean expected = true;
        var result = solution.isValidSerialization(preorder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String preorder = "1,#";
        boolean expected = false;
        var result = solution.isValidSerialization(preorder);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String preorder = "9,#,#,1";
        boolean expected = false;
        var result = solution.isValidSerialization(preorder);
        assertThat(result).isEqualTo(expected);
    }

}
