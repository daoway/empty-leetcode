package com.blogspot.ostas.leetcode.all.easy.evaluate_boolean_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [2,1,3,null,null,0,1]
    Output: true
    Explanation: The above diagram illustrates the evaluation process.
    The AND node evaluates to False AND True = False.
    The OR node evaluates to True OR False = True.
    The root node evaluates to True, so we return true.
    Example 2:
    Input: root = [0]
    Output: false
    Explanation: The root node is a leaf node and it evaluates to false, so we return false.
      Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    0 <= Node.val <= 3
    Every node has either 0 or 2 children.
    Leaf nodes have a value of 0 or 1.
    Non-leaf nodes have a value of 2 or 3.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(1, null, null),
                new TreeNode(3, new TreeNode(0, null, null), new TreeNode(1, null, null)));
        boolean expected = true;
        var result = solution.evaluateTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(0, null, null);
        boolean expected = false;
        var result = solution.evaluateTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
