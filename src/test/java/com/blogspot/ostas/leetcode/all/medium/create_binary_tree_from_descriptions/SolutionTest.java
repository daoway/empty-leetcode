package com.blogspot.ostas.leetcode.all.medium.create_binary_tree_from_descriptions;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
    Output: [50,20,80,15,17,19]
    Explanation: The root node is the node with value 50 since it has no parent.
    The resulting binary tree is shown in the diagram.
    Example 2:
    Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
    Output: [1,2,null,null,3,4]
    Explanation: The root node is the node with value 1 since it has no parent.
    The resulting binary tree is shown in the diagram.
      Constraints:
    1 <= descriptions.length <= 104
    descriptions[i].length == 3
    1 <= parenti, childi <= 105
    0 <= isLefti <= 1
    The binary tree described by descriptions is valid.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] descriptions = new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0},
                {80, 19, 1}};
        TreeNode expected = new TreeNode(50,
                new TreeNode(20, new TreeNode(15, null, null), new TreeNode(17, null, null)),
                new TreeNode(80, new TreeNode(19, null, null), null));
        var result = solution.createBinaryTree(descriptions);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] descriptions = new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}};
        TreeNode expected1 =
                new TreeNode(1, new TreeNode(2, null, new TreeNode(3, new TreeNode(4, null, null), null)),
                        null);
        TreeNode expected2 =
                new TreeNode(2, null, new TreeNode(3, new TreeNode(4, null, null), null));
        var result = solution.createBinaryTree(descriptions);
        assertThat(result).isIn(expected1, expected2);
    }

}
