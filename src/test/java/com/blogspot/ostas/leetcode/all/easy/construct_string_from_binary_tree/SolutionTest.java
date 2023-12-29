package com.blogspot.ostas.leetcode.all.easy.construct_string_from_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2,3,4]
    Output: "1(2(4))(3)"
    Explanation: Originally, it needs to be "1(2(4)())(3()())", but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"
    Example 2:
    Input: root = [1,2,3,null,4]
    Output: "1(2()(4))(3)"
    Explanation: Almost the same as the first example, except we cannot omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.
      Constraints:
    The number of nodes in the tree is in the range [1, 104].
    -1000 <= Node.val <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null),
                new TreeNode(3, null, null));
        String expected = "1(2(4))(3)";
        var result = solution.tree2str(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, null));
        String expected = "1(2()(4))(3)";
        var result = solution.tree2str(root);
        assertThat(result).isEqualTo(expected);
    }

}
