package com.blogspot.ostas.leetcode.all.medium.delete_node_in_a_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,3,6,2,4,null,7], key = 3
    Output: [5,4,6,2,null,null,7]
    Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
    One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
    Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
    Example 2:
    Input: root = [5,3,6,2,4,null,7], key = 0
    Output: [5,3,6,2,4,null,7]
    Explanation: The tree does not contain a node with value = 0.
    Example 3:
    Input: root = [], key = 0
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [0, 104].
    -105 <= Node.val <= 105
    Each node has a unique value.
    root is a valid binary search tree.
    -105 <= key <= 105
      Follow up: Could you solve it with time complexity O(height of tree)?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                        new TreeNode(6, null, new TreeNode(7, null, null)));
        int key = 3;
        TreeNode expected = new TreeNode(5, new TreeNode(4, new TreeNode(2, null, null), null),
                new TreeNode(6, null, new TreeNode(7, null, null)));
        var result = solution.deleteNode(root, key);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                        new TreeNode(6, null, new TreeNode(7, null, null)));
        int key = 0;
        TreeNode expected =
                new TreeNode(5, new TreeNode(3, new TreeNode(2, null, null), new TreeNode(4, null, null)),
                        new TreeNode(6, null, new TreeNode(7, null, null)));
        var result = solution.deleteNode(root, key);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = null;
        int key = 0;
        TreeNode expected = null;
        var result = solution.deleteNode(root, key);
        assertThat(result).isEqualTo(expected);
    }

}
