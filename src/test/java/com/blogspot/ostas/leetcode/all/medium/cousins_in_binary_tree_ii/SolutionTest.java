package com.blogspot.ostas.leetcode.all.medium.cousins_in_binary_tree_ii;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,4,9,1,10,null,7]
    Output: [0,0,0,7,7,null,11]
    Explanation: The diagram above shows the initial binary tree and the binary tree after changing the value of each node.
    - Node with value 5 does not have any cousins so its sum is 0.
    - Node with value 4 does not have any cousins so its sum is 0.
    - Node with value 9 does not have any cousins so its sum is 0.
    - Node with value 1 has a cousin with value 7 so its sum is 7.
    - Node with value 10 has a cousin with value 7 so its sum is 7.
    - Node with value 7 has cousins with values 1 and 10 so its sum is 11.
    Example 2:
    Input: root = [3,1,2]
    Output: [0,0,0]
    Explanation: The diagram above shows the initial binary tree and the binary tree after changing the value of each node.
    - Node with value 3 does not have any cousins so its sum is 0.
    - Node with value 1 does not have any cousins so its sum is 0.
    - Node with value 2 does not have any cousins so its sum is 0.
      Constraints:
    The number of nodes in the tree is in the range [1, 105].
    1 <= Node.val <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(4, new TreeNode(1, null, null), new TreeNode(10, null, null)),
                        new TreeNode(9, null, new TreeNode(7, null, null)));
        TreeNode expected =
                new TreeNode(0, new TreeNode(0, new TreeNode(7, null, null), new TreeNode(7, null, null)),
                        new TreeNode(0, null, new TreeNode(11, null, null)));
        var result = solution.replaceValueInTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(1, null, null), new TreeNode(2, null, null));
        TreeNode expected = new TreeNode(0, new TreeNode(0, null, null), new TreeNode(0, null, null));
        var result = solution.replaceValueInTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
