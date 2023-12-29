package com.blogspot.ostas.leetcode.all.medium.all_nodes_distance_k_in_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
    Output: [7,4,1]
    Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.
    Example 2:
    Input: root = [1], target = 1, k = 3
    Output: []
      Constraints:
    The number of nodes in the tree is in the range [1, 500].
    0 <= Node.val <= 500
    All the values Node.val are unique.
    target is the value of one of the nodes in the tree.
    0 <= k <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(5, new TreeNode(6, null, null),
                        new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(0, null, null), new TreeNode(8, null, null)));
        TreeNode target = root.left; //5
        int k = 2;
        List<Integer> expected = List.of(7, 4, 1);
        var result = solution.distanceK(root, target, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        TreeNode target = root;
        int k = 3;
        List<Integer> expected = List.of();
        var result = solution.distanceK(root, target, k);
        assertThat(result).isEqualTo(expected);
    }

}
