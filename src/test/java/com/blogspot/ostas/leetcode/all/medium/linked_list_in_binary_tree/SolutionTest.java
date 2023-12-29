package com.blogspot.ostas.leetcode.all.medium.linked_list_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.ListNode;
import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
    Output: true
    Explanation: Nodes in blue form a subpath in the binary Tree.
    Example 2:
    Input: head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
    Output: true
    Example 3:
    Input: head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
    Output: false
    Explanation: There is no path in the binary tree that contains all the elements of the linked list from head.
      Constraints:
    The number of nodes in the tree will be in the range [1, 2500].
    The number of nodes in the list will be in the range [1, 100].
    1 <= Node.val <= 100 for each node in the linked list and binary tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(8)));
        TreeNode root =
                new TreeNode(1, new TreeNode(4, null, new TreeNode(2, new TreeNode(1, null, null), null)),
                        new TreeNode(4, new TreeNode(2, new TreeNode(6, null, null),
                                new TreeNode(8, new TreeNode(1, null, null), new TreeNode(3, null, null))), null));
        boolean expected = true;
        var result = solution.isSubPath(head, root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(6))));
        TreeNode root =
                new TreeNode(1, new TreeNode(4, null, new TreeNode(2, new TreeNode(1, null, null), null)),
                        new TreeNode(4, new TreeNode(2, new TreeNode(6, null, null),
                                new TreeNode(8, new TreeNode(1, null, null), new TreeNode(3, null, null))), null));
        boolean expected = true;
        var result = solution.isSubPath(head, root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        ListNode head =
                new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(6, new ListNode(8)))));
        TreeNode root =
                new TreeNode(1, new TreeNode(4, null, new TreeNode(2, new TreeNode(1, null, null), null)),
                        new TreeNode(4, new TreeNode(2, new TreeNode(6, null, null),
                                new TreeNode(8, new TreeNode(1, null, null), new TreeNode(3, null, null))), null));
        boolean expected = false;
        var result = solution.isSubPath(head, root);
        assertThat(result).isEqualTo(expected);
    }

}
