package com.blogspot.ostas.leetcode.all.medium.flatten_binary_tree_to_linked_list;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    /*
        Example 1:
    Input: root = [1,2,5,3,4,null,6]
    Output: [1,null,2,null,3,null,4,null,5,null,6]
    Example 2:
    Input: root = []
    Output: []
    Example 3:
    Input: root = [0]
    Output: [0]
      Constraints:
    The number of nodes in the tree is in the range [0, 2000].
    -100 <= Node.val <= 100
      Follow up: Can you flatten the tree in-place (with O(1) extra space)?
    */

    @Test
    void test_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode();
        solution.flatten(root);
    }
}
