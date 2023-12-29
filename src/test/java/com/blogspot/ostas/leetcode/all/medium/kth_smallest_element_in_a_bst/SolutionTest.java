package com.blogspot.ostas.leetcode.all.medium.kth_smallest_element_in_a_bst;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,1,4,null,2], k = 1
    Output: 1
    Example 2:
    Input: root = [5,3,6,2,4,null,null,1], k = 3
    Output: 3
      Constraints:
    The number of nodes in the tree is n.
    1 <= k <= n <= 104
    0 <= Node.val <= 104
      Follow up: If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2, null, null)),
                new TreeNode(4, null, null));
        int k = 1;
        int expected = 1;
        var result = solution.kthSmallest(root, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2, new TreeNode(1, null, null), null),
                        new TreeNode(4, null, null)),
                new TreeNode(6, null, null));
        int k = 3;
        int expected = 3;
        var result = solution.kthSmallest(root, k);
        assertThat(result).isEqualTo(expected);
    }

}
