package com.blogspot.ostas.leetcode.all.medium.amount_of_time_for_binary_tree_to_be_infected;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [1,5,3,null,4,10,6,9,2], start = 3
    Output: 4
    Explanation: The following nodes are infected during:
    - Minute 0: Node 3
    - Minute 1: Nodes 1, 10 and 6
    - Minute 2: Node 5
    - Minute 3: Node 4
    - Minute 4: Nodes 9 and 2
    It takes 4 minutes for the whole tree to be infected so we return 4.
    Example 2:
    Input: root = [1], start = 1
    Output: 0
    Explanation: At minute 0, the only node in the tree is infected so we return 0.
      Constraints:
    The number of nodes in the tree is in the range [1, 105].
    1 <= Node.val <= 105
    Each node has a unique value.
    A node with a value of start exists in the tree.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(5, null,
                        new TreeNode(4, new TreeNode(9, null, null), new TreeNode(2, null, null))),
                new TreeNode(3, new TreeNode(10, null, null), new TreeNode(6, null, null)));
        int start = 3;
        int expected = 4;
        var result = solution.amountOfTime(root, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, null, null);
        int start = 1;
        int expected = 0;
        var result = solution.amountOfTime(root, start);
        assertThat(result).isEqualTo(expected);
    }

}
