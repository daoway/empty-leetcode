package com.blogspot.ostas.leetcode.all.medium.print_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,2]
    Output:
    [["","1",""],
     ["2","",""]]
    Example 2:
    Input: root = [1,2,3,null,4]
    Output:
    [["","","","1","","",""],
     ["","2","","","","3",""],
     ["","","4","","","",""]]
      Constraints:
    The number of nodes in the tree is in the range [1, 210].
    -99 <= Node.val <= 99
    The depth of the tree will be in the range [1, 10].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        List<List<String>> expected = List.of(List.of("", "1", ""), List.of("2", "", ""));
        var result = solution.printTree(root);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, null));
        List<List<String>> expected = List.of(List.of("", "", "", "1", "", "", ""), List.of("", "2", "", "", "", "3", ""), List.of("", "", "4", "", "", "", ""));
        var result = solution.printTree(root);
        assertThat(result).isEqualTo(expected);
    }

}
