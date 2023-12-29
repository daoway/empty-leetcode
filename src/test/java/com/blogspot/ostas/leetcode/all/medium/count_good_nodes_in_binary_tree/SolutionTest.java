package com.blogspot.ostas.leetcode.all.medium.count_good_nodes_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,1,4,3,null,1,5]
    Output: 4
    Explanation: Nodes in blue are good.
    Root Node (3) is always a good node.
    Node 4 -> (3,4) is the maximum value in the path starting from the root.
    Node 5 -> (3,4,5) is the maximum value in the path
    Node 3 -> (3,1,3) is the maximum value in the path.
    Example 2:
    Input: root = [3,3,null,4,2]
    Output: 3
    Explanation: Node 2 -> (3, 3, 2) is not good, because "3" is higher than it.
    Example 3:
    Input: root = [1]
    Output: 1
    Explanation: Root is considered as good.
      Constraints:
    The number of nodes in the binary tree is in the range [1, 10^5].
    Each node's value is between [-10^4, 10^4].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(1, new TreeNode(3, null, null), null),
                new TreeNode(4, new TreeNode(1, null, null), new TreeNode(5, null, null)));
        int expected = 4;
        var result = solution.goodNodes(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(3, new TreeNode(3, new TreeNode(4, null, null), new TreeNode(2, null, null)),
                        null);
        int expected = 3;
        var result = solution.goodNodes(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int expected = 1;
        var result = solution.goodNodes(root);
        assertThat(result).isEqualTo(expected);
    }

}
