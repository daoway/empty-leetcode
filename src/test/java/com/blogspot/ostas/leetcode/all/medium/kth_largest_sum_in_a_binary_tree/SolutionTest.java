package com.blogspot.ostas.leetcode.all.medium.kth_largest_sum_in_a_binary_tree;

import com.blogspot.ostas.leetcode.all.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: root = [5,8,9,2,1,3,7,4,6], k = 2
    Output: 13
    Explanation: The level sums are the following:
    - Level 1: 5.
    - Level 2: 8 + 9 = 17.
    - Level 3: 2 + 1 + 3 + 7 = 13.
    - Level 4: 4 + 6 = 10.
    The 2nd largest level sum is 13.
    Example 2:
    Input: root = [1,2,null,3], k = 1
    Output: 3
    Explanation: The largest level sum is 3.
      Constraints:
    The number of nodes in the tree is n.
    2 <= n <= 105
    1 <= Node.val <= 106
    1 <= k <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        TreeNode root = new TreeNode(5,
                new TreeNode(8, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(6, null, null)),
                        new TreeNode(1, null, null)),
                new TreeNode(9, new TreeNode(3, null, null), new TreeNode(7, null, null)));
        int k = 2;
        long expected = 13;
        var result = solution.kthLargestLevelSum(root, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), null), null);
        int k = 1;
        long expected = 3;
        var result = solution.kthLargestLevelSum(root, k);
        assertThat(result).isEqualTo(expected);
    }

}
