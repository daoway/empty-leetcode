package com.blogspot.ostas.leetcode.all.easy.binary_tree_paths;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,null,5]
    Output: ["1->2->5","1->3"]
    Example 2:
    Input: root = [1]
    Output: ["1"]
      Constraints:
    The number of nodes in the tree is in the range [1, 100].
    -100 <= Node.val <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5, null, null)),
                new TreeNode(3, null, null));
        List<String> expected = List.of("1->2->5", "1->3");
        var result = solution.binaryTreePaths(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        List<String> expected = List.of("1");
        var result = solution.binaryTreePaths(root);
        assertThat(result).isEqualTo(expected);
    }

}
