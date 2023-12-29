package com.blogspot.ostas.leetcode.all.easy.binary_tree_tilt;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3]
    Output: 1
    Explanation:
    Tilt of node 2 : |0-0| = 0 (no children)
    Tilt of node 3 : |0-0| = 0 (no children)
    Tilt of node 1 : |2-3| = 1 (left subtree is just left child, so sum is 2; right subtree is just right child, so sum is 3)
    Sum of every tilt : 0 + 0 + 1 = 1
    Example 2:
    Input: root = [4,2,9,3,5,null,7]
    Output: 15
    Explanation:
    Tilt of node 3 : |0-0| = 0 (no children)
    Tilt of node 5 : |0-0| = 0 (no children)
    Tilt of node 7 : |0-0| = 0 (no children)
    Tilt of node 2 : |3-5| = 2 (left subtree is just left child, so sum is 3; right subtree is just right child, so sum is 5)
    Tilt of node 9 : |0-7| = 7 (no left child, so sum is 0; right subtree is just right child, so sum is 7)
    Tilt of node 4 : |(3+5+2)-(9+7)| = |10-16| = 6 (left subtree values are 3, 5, and 2, which sums to 10; right subtree values are 9 and 7, which sums to 16)
    Sum of every tilt : 0 + 0 + 0 + 2 + 7 + 6 = 15
    Example 3:
    Input: root = [21,7,14,1,1,2,2,3,3]
    Output: 9
      Constraints:
    The number of nodes in the tree is in the range [0, 104].
    -1000 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        int expected = 1;
        var result = solution.findTilt(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(4, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(5, null, null)),
                        new TreeNode(9, null, new TreeNode(7, null, null)));
        int expected = 15;
        var result = solution.findTilt(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        TreeNode root = new TreeNode(21,
                new TreeNode(7, new TreeNode(1, new TreeNode(3, null, null), new TreeNode(3, null, null)),
                        new TreeNode(1, null, null)),
                new TreeNode(14, new TreeNode(2, null, null), new TreeNode(2, null, null)));
        int expected = 9;
        var result = solution.findTilt(root);
        assertThat(result).isEqualTo(expected);
    }

}
