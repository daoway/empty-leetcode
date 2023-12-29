package com.blogspot.ostas.leetcode.all.medium.validate_binary_tree_nodes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,-1,-1,-1]
    Output: true
    Example 2:
    Input: n = 4, leftChild = [1,-1,3,-1], rightChild = [2,3,-1,-1]
    Output: false
    Example 3:
    Input: n = 2, leftChild = [1,0], rightChild = [-1,-1]
    Output: false
      Constraints:
    n == leftChild.length == rightChild.length
    1 <= n <= 104
    -1 <= leftChild[i], rightChild[i] <= n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int[] leftChild = new int[]{1, -1, 3, -1};
        int[] rightChild = new int[]{2, -1, -1, -1};
        boolean expected = true;
        var result = solution.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int[] leftChild = new int[]{1, -1, 3, -1};
        int[] rightChild = new int[]{2, 3, -1, -1};
        boolean expected = false;
        var result = solution.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 2;
        int[] leftChild = new int[]{1, 0};
        int[] rightChild = new int[]{-1, -1};
        boolean expected = false;
        var result = solution.validateBinaryTreeNodes(n, leftChild, rightChild);
        assertThat(result).isEqualTo(expected);
    }

}
