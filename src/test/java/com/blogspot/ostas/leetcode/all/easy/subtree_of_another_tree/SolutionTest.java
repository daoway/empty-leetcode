package com.blogspot.ostas.leetcode.all.easy.subtree_of_another_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [3,4,5,1,2], subRoot = [4,1,2]
    Output: true
    Example 2:
    Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
    Output: false
      Constraints:
    The number of nodes in the root tree is in the range [1, 2000].
    The number of nodes in the subRoot tree is in the range [1, 1000].
    -104 <= root.val <= 104
    -104 <= subRoot.val <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root =
                new TreeNode(3, new TreeNode(4, new TreeNode(1, null, null), new TreeNode(2, null, null)),
                        new TreeNode(5, null, null));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1, null, null), new TreeNode(2, null, null));
        boolean expected = true;
        var result = solution.isSubtree(root, subRoot);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1, null, null),
                        new TreeNode(2, new TreeNode(0, null, null), null)),
                new TreeNode(5, null, null));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1, null, null), new TreeNode(2, null, null));
        boolean expected = false;
        var result = solution.isSubtree(root, subRoot);
        assertThat(result).isEqualTo(expected);
    }

}
