package com.blogspot.ostas.leetcode.all.hard.recover_a_tree_from_preorder_traversal;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: traversal = "1-2--3--4-5--6--7"
    Output: [1,2,5,3,4,6,7]
    Example 2:
    Input: traversal = "1-2--3---4-5--6---7"
    Output: [1,2,5,3,null,6,null,4,null,7]
    Example 3:
    Input: traversal = "1-401--349---90--88"
    Output: [1,401,null,349,88,90]
      Constraints:
    The number of nodes in the original tree is in the range [1, 1000].
    1 <= Node.val <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String traversal = "1-2--3--4-5--6--7";
        TreeNode expected =
                new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
                        new TreeNode(5, new TreeNode(6, null, null), new TreeNode(7, null, null)));
        var result = solution.recoverFromPreorder(traversal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String traversal = "1-2--3---4-5--6---7";
        TreeNode expected =
                new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, null, null), null), null),
                        new TreeNode(5, new TreeNode(6, new TreeNode(7, null, null), null), null));
        var result = solution.recoverFromPreorder(traversal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String traversal = "1-401--349---90--88";
        TreeNode expected = new TreeNode(1,
                new TreeNode(401, new TreeNode(349, new TreeNode(90, null, null), null),
                        new TreeNode(88, null, null)),
                null);
        var result = solution.recoverFromPreorder(traversal);
        assertThat(result).isEqualTo(expected);
    }

}
