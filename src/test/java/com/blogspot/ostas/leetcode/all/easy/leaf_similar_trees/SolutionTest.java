package com.blogspot.ostas.leetcode.all.easy.leaf_similar_trees;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
    Output: true
    Example 2:
    Input: root1 = [1,2,3], root2 = [1,3,2]
    Output: false
      Constraints:
    The number of nodes in each tree will be in the range [1, 200].
    Both of the given trees will have values in the range [0, 200].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6, null, null),
                        new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(9, null, null), new TreeNode(8, null, null)));
        TreeNode root2 =
                new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null), new TreeNode(7, null, null)),
                        new TreeNode(1, new TreeNode(4, null, null),
                                new TreeNode(2, new TreeNode(9, null, null), new TreeNode(8, null, null))));
        boolean expected = true;
        var result = solution.leafSimilar(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode root2 = new TreeNode(1, new TreeNode(3, null, null), new TreeNode(2, null, null));
        boolean expected = false;
        var result = solution.leafSimilar(root1, root2);
        assertThat(result).isEqualTo(expected);
    }

}
